package com.service;

import java.util.List;

import com.entity.User;

public interface IUserService {
	public List<User> getAllUser();//��ѯ�����û�
	public List<User> getSomeUser(User user);//��ѯһ�����û�
	public String insertUser(User user);//����һ���û�
	public String delteteUserByID(String fUser);//ͨ��һ���û���ɾ��һ���û�
	public String updateUser(User user);//ͨ���û���������һ���û�
	public String loginfo(String fUser,String fPassword);//��¼����
	public User getOneUserByUser(String fUser);//ͨ���û�����ѯһ���û�
}
