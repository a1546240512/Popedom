package com.dao;

import java.util.List;

import com.entity.Role;

public interface IRoleDao {
	public List<Role> selectAllRole();//��ѯ���н�ɫ
	public List<Role> selectSomeRole(String fRoleName);//ͨ����ɫ���Ʋ�ѯһЩ��ɫ
	public Role selectOneRole(int fRoleID);//ͨ��ID��ѯһ����ɫ
	public int selectIDByName(String fRoleName);//ͨ�����ֲ�ѯID
	public int insertRole(Role role);//����һ����ɫ
	public int deleteRole(int fRoleID);//ɾ��һ����ɫ
	public int updateRole(Role role);//�޸�һ����ɫ

}
