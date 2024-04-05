package com.prowing.wirebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	
	public static void main(String[] args) {
	 
		 ApplicationContext context = new ClassPathXmlApplicationContext("springautowire.xml");
		 
		 Person ps = context.getBean(Person.class, "person");
		 System.out.println(ps);
		
		 AbstractApplicationContext contextz =new ClassPathXmlApplicationContext();
	}
}
