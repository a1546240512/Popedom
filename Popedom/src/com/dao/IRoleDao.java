package com.dao;

import java.util.List;

import com.entity.Role;

public interface IRoleDao {
	public List<Role> selectAllRole();//查询所有角色
	public List<Role> selectSomeRole(String fRoleName);//通过角色名称查询一些角色
	public Role selectOneRole(int fRoleID);//通过ID查询一个角色
	public int selectIDByName(String fRoleName);//通过名字查询ID
	public int insertRole(Role role);//增加一个角色
	public int deleteRole(int fRoleID);//删除一个角色
	public int updateRole(Role role);//修改一个角色

}
