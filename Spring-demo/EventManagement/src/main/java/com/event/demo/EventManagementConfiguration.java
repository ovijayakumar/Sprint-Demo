package com.event.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.event.demo.controller.LoginController;
import com.event.demo.service.UserService;

@Configuration
@ComponentScan(basePackages= {"com.event.demo","",""})
@PropertySource(value = { "classpath:application.properties" },ignoreResourceNotFound=true)
//@Import(value= {Configuration2.class})
public class EventManagementConfiguration {

	/*<bean class="com.event.demo.service.UserService" id="userService">
	<constructor-arg value="test"></constructor-arg>
	</bean>*/
	
	/*@Bean
//	@Scope("prototype")
	public UserService userService() {
		System.out.println("Java Based Bean UserService");
		UserService userService=new UserService("testest");
		return userService;
	}
	
	@Bean
	public LoginController loginController() {
		System.out.println("Java Based Bean LoginController");
		LoginController loginController=new LoginController();
		//setter based configuration
		loginController.setUserService(userService());
		return loginController;
	}*/
}
