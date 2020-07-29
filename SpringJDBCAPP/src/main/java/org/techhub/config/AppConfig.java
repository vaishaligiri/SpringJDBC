package org.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean(name="d")
	public DriverManagerDataSource getDataSource()
	{ 
		 DriverManagerDataSource d=new DriverManagerDataSource();
		 d.setUrl("jdbc:mysql://localhost:3306/mysql");
		 d.setPassword("system");
		 d.setUsername("root");
		 d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 return d;
	}
	@Bean(name="template")
	public JdbcTemplate getTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}
	
}
