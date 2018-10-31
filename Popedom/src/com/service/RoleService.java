package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IRoleDao;
import com.dao.IUserDao;
import com.entity.Role;
import com.entity.User;
@Service
public class RoleService implements IRoleService {
	@Autowired
	private IRoleDao iRoleDao;
	
	public IRoleDao getiRoleDao() {
		return iRoleDao;
	}

	public void setiRoleDao(IRoleDao iRoleDao) {
		this.iRoleDao = iRoleDao;
	}
	@Autowired
	private IUserDao iUserDao;
	
	

	public IUserDao getiUserDao() {
		return iUserDao;
	}

	public void setiUserDao(IUserDao iUserDao) {
		this.iUserDao = iUserDao;
	}

	@Override
	public List<Role> selectAllRole() {
		List<Role> list =iRoleDao.selectAllRole();
		return list;
	}

	@Override
	public List<Role> selectSomeRole(String fRoleName) {
		List<Role> list =iRoleDao.selectSomeRole(fRoleName);
		return list;
	}

	@Override
	public Role selectOneRole(int fRoleID) {
		Role role=iRoleDao.selectOneRole(fRoleID);
		return role;
	}

	@Override
	public String insertRole(Role role) {
		String str="";
		Role r=iRoleDao.selectOneRole(role.getfRoleID());
		if(r==null){
			int i = iRoleDao.insertRole(role);
			str="添加成功";
		}else{
			str="添加失败数据重复";
		}
		
		return str;
	}

	@Override
	public String deleteRole(int fRoleID) {
		String str="";
		List<User> i=iUserDao.selectUserByFRoleID(fRoleID);
		if(i.size()==0){
			int in = iRoleDao.deleteRole(fRoleID);
			str="删除成功";
		}else{
			str="删除失败，该角色用用户在使用";
		}
		return str;
	}

	@Override
	public String updateRole(Role role,int fRoleID) {
		String str="";
		if(fRoleID==role.getfRoleID()){
			int i=iRoleDao.updateRole(role);
			str = "修改成功";
		} else {
			Role r = iRoleDao.selectOneRole(role.getfRoleID());
			if (r == null) {
				int i = iRoleDao.deleteRole(fRoleID);
				i = iRoleDao.insertRole(role);
				str = "修改成功";
			} else {
				str = "修改失败，修改ID重复";
			}
		}
		return str;
	}

}
