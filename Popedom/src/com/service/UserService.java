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
	public List<User> getSomeUser(User user) {//通過用戶名 和班次還有創造者查詢
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
				str="增加成功";
			}
		}else{
			str="用户名重复，增加失败";
		}
		return str;
	}

	@Override
	public String delteteUserByID(String fUser) {
		int i = iUserDao.delteteUserByID(fUser);
		String str="";
		if(i>0){
			str="删除成功";
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
			str = "修改成功";
		}
		return str;
	}

	@Override
	public String loginfo(String fUser,String fPassword) {
		String password=iUserDao.loginfo(fUser);
		String str="";
		if(password==null){
			str="登录失败用户名不存在";
		}else{
			if(password.equals(fPassword)){
				str="登录成功";
			}else{
				str="登录失败密码错误";
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
