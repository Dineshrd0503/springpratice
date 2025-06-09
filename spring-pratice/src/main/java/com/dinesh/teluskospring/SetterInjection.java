package com.dinesh.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using the property tags of xml to set value age");
		System.out.println("trying on employee class to get sal");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee) context.getBean("emp");
		
		System.out.println(" sal of employee is "+emp.getSal()
		);
		

	}

}
