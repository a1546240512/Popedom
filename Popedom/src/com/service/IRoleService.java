package com.service;

import java.util.List;

import com.entity.Role;

public interface IRoleService {
	public List<Role> selectAllRole();//查询所有角色
	public List<Role> selectSomeRole(String fRoleName);//通过角色名称查询一些角色
	public Role selectOneRole(int fRoleID);//通过ID查询一个角色
	public String insertRole(Role role);//增加一个角色ID和用户名不允许为空
	public String deleteRole(int fRoleID);//删除一个角色
	public String updateRole(Role role,int fRoleID);//修改一个角色,后面的是原角色ID
}
