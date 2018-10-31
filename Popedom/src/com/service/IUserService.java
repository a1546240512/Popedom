package com.service;

import java.util.List;

import com.entity.User;

public interface IUserService {
	public List<User> getAllUser();//查询所有用户
	public List<User> getSomeUser(User user);//查询一部分用户
	public String insertUser(User user);//增加一个用户
	public String delteteUserByID(String fUser);//通过一个用户名删除一个用户
	public String updateUser(User user);//通过用户名来更改一个用户
	public String loginfo(String fUser,String fPassword);//登录方法
	public User getOneUserByUser(String fUser);//通过用户名查询一个用户
}
