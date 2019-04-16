package com.event.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.event.demo.controller.LoginController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Tool - ApplicationContext (Representative for IoC Container)
    	
    	//ApplicationContext appcontext= new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	ApplicationContext appcontext= new AnnotationConfigApplicationContext(EventManagementConfiguration.class); 
    	
        //LoginController loginController=(LoginController) appcontext.getBean("loginController");
        
        LoginController loginController=appcontext.getBean(LoginController.class);
        
        String status=loginController.loginEndpoint("vijay", "kumar");
        
        System.out.println("Login Status==>"+status);
    }
}
