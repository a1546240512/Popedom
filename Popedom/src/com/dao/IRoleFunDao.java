package com.dao;

import java.util.List;

import com.entity.RoleFun;

public interface IRoleFunDao {
	public List getOneRoleFun(int fRoleID);// ͨ����ɫID��ѯһ����ɫ�Ĺ���

	public int deleteRoleFun(int fRoleID);// ɾ��һ����ɫ�Ĺ���

	public int insertRoleFun(RoleFun roleFun);// ���ӽ�ɫ��һ������

	public List selectFunID(int fRoleID);// ��ѯ����ID��ֹ����
}
