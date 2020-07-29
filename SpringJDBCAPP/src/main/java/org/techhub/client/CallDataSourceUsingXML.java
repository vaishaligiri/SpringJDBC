package org.techhub.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CallDataSourceUsingXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		JdbcTemplate template=(JdbcTemplate)context.getBean("template");
		template.execute("insert into regspringjdbc values('mno','mno@gmail.com','454545')");
		System.out.println("Record Save Successs............");
	}

}
