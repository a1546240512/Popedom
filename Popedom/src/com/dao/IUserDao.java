package com.dao;

import java.util.List;

import com.entity.User;

public interface IUserDao {
	public List<User> getAllUser();//��ѯ�����û�
	public List<User> getSomeUser(User user);//��ѯһ�����û�
	public User getOneUserByUser(String fUser);//ͨ���û�����ѯһ���û�
	public int insertUser(User user);//����һ���û�
	public int delteteUserByID(String fUser);//ͨ��һ���û���ɾ��һ���û�
	public int updateUser(User user);//ͨ���û���������һ���û�
	public String loginfo(String fUser);//��¼����
	public List<User> selectUserByFRoleID(int FRoleID);//ͨ����ɫID��ѯһ���û�
}
