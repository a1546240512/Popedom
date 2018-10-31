package com.text;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Role;
import com.service.IRoleService;

public class RoleText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IRoleService irs =(IRoleService)context.getBean("roleService");
		/*Role r =new Role();
		r.setfRoleID(2);
		r.setfRoleName("人事管理员");
		r.setfCreateUser("李学辉");
		r.setfDescription("管理人事");
		Date data=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Timestamp ts= new Timestamp(data.getTime());
		r.setfLastEditTime(ts);
		String str=irs.updateRole(r, 4);*/
		String str = irs.deleteRole(3);
		System.out.println(str);
	}

}
