package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@PropertySource("classpath:spring/db.properties")
public class SpringConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	private @Value("${jdbc.username}") String username;
	private @Value("${jdbc.password}") String password;
	
	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		basicDataSource.setUrl("jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Seoul");
//		basicDataSource.setUsername("root");
//		basicDataSource.setPassword("1234");
		
		basicDataSource.setDriverClassName(driver);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		
		return basicDataSource;
	}

}
