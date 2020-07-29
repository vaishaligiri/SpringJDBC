package org.techhub.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.techhub.config.AppConfig;

public class DataSourceCallingByAnnot {

	public static void main(String x[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate template=(JdbcTemplate)context.getBean("template");
		template.execute("insert into regspringjdbc values('pqr','pqr@gmail.com','45454545')");
		System.out.println("Record Save Success..............");
	}
}
