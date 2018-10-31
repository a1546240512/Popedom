package com.text;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;
import com.service.IUserService;

public class UserText {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IUserService ius=(IUserService)context.getBean("userService");
		Date data=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Timestamp ts= new Timestamp(data.getTime());
		System.out.println(ts);
		User user=new User("1", "1", "", 0, "第1個用戶", "", ts, "仓库管理员");
		/*int i = ius.insertUser(user);
		int i = ius.delteteUserByID("韩祥祥");*/
		String i =ius.updateUser(user);
		//List<User> list = ius.getSomeUser(user);
		System.out.println(i);
	}

}
