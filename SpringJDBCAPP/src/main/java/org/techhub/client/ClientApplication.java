package org.techhub.client;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 DriverManagerDataSource d=new DriverManagerDataSource();
		 d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 d.setUsername("root");
		 d.setPassword("system");
		 d.setUrl("jdbc:mysql://localhost:3306/mysql");
		 if(d!=null)
		 {
			 System.out.println("Database Connected");
			 JdbcTemplate template=new JdbcTemplate();
			 template.setDataSource(d);
			 template.execute("insert into regspringjdbc values('abc','abc@gmail.com','12345')");
		 }
		 else
		 {
			 System.out.println("Database Not Connected");
		 }
	}

}
