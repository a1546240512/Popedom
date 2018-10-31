package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IRoleDao;
import com.dao.IUserDao;
import com.entity.User;
@Service
public class UserService implements IUserService{
	public UserService(){
	}
	@Autowired
	private IUserDao iUserDao;
	
	
	public IUserDao getiUserDao() {
		return iUserDao;
	}

	public void setiUserDao(IUserDao iUserDao) {
		this.iUserDao = iUserDao;
	}
	@Autowired
	private IRoleDao iRoleDao;
	

	public IRoleDao getiRoleDao() {
		return iRoleDao;
	}

	public void setiRoleDao(IRoleDao iRoleDao) {
		this.iRoleDao = iRoleDao;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = iUserDao.getAllUser();
		return list;
	}

	@Override
	public List<User> getSomeUser(User user) {//ͨ�^�Ñ��� �Ͱ��߀�Є����߲�ԃ
		List<User> list = iUserDao.getSomeUser(user);
		return list;
	}

	@Override
	public String insertUser(User user) {
		String fuser=user.getfUser();
		int i=0;
		String str="";
		User iuser=iUserDao.getOneUserByUser(fuser);
		if(iuser==null){
			int roleid=iRoleDao.selectIDByName(user.getfRoleName());
			user.setfRoleID(roleid);
			i=iUserDao.insertUser(user);
			if(i==1){
				str="���ӳɹ�";
			}
		}else{
			str="�û����ظ�������ʧ��";
		}
		return str;
	}

	@Override
	public String delteteUserByID(String fUser) {
		int i = iUserDao.delteteUserByID(fUser);
		String str="";
		if(i>0){
			str="ɾ���ɹ�";
		}
		return str;
	}

	@Override
	public String updateUser(User user) {
		int i =0;
		int roleid=iRoleDao.selectIDByName(user.getfRoleName());
		user.setfRoleID(roleid);
		i=iUserDao.updateUser(user);
		String str="";
		if (i > 0) {
			str = "�޸ĳɹ�";
		}
		return str;
	}

	@Override
	public String loginfo(String fUser,String fPassword) {
		String password=iUserDao.loginfo(fUser);
		String str="";
		if(password==null){
			str="��¼ʧ���û���������";
		}else{
			if(password.equals(fPassword)){
				str="��¼�ɹ�";
			}else{
				str="��¼ʧ���������";
			}
			
		};
		return str;
	}

	@Override
	public User getOneUserByUser(String fUser) {
		User user=iUserDao.getOneUserByUser(fUser);
		return user;
	}

}
