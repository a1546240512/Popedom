package com.dao;

import java.util.List;

import com.entity.RoleFun;

public interface IRoleFunDao {
	public List getOneRoleFun(int fRoleID);// 通过角色ID查询一个角色的功能

	public int deleteRoleFun(int fRoleID);// 删除一个角色的功能

	public int insertRoleFun(RoleFun roleFun);// 增加角色的一个功能

	public List selectFunID(int fRoleID);// 查询功能ID防止出错
}
