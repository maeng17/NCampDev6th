package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample01.LoggingAdvice;
import sample01.MessageBeanImpl;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguraion {
	@Bean
	public MessageBeanImpl messageBeanImpl () {
		return new MessageBeanImpl();
	}
	
	@Bean
	public LoggingAdvice loggingAdvice() {
		return new LoggingAdvice();
	}

}

//acQuickStart.xml과 같은 취급