package com.service;

import java.util.List;

import com.entity.Role;

public interface IRoleService {
	public List<Role> selectAllRole();//��ѯ���н�ɫ
	public List<Role> selectSomeRole(String fRoleName);//ͨ����ɫ���Ʋ�ѯһЩ��ɫ
	public Role selectOneRole(int fRoleID);//ͨ��ID��ѯһ����ɫ
	public String insertRole(Role role);//����һ����ɫID���û���������Ϊ��
	public String deleteRole(int fRoleID);//ɾ��һ����ɫ
	public String updateRole(Role role,int fRoleID);//�޸�һ����ɫ,�������ԭ��ɫID
}
