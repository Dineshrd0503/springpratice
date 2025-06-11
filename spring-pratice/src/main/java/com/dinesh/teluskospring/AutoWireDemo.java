package com.dinesh.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("now demonstrating autwired nototaion");
		System.out.println("using a computer interface and implementing laptop and deskotp class");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("creating a employee object and calling comuter interface");
		Employee obj=(Employee) context.getBean("emp");
		obj.usecom();
		
		System.out.println("now using the autowire notoaion byname in xml tag to call deskotp");
		
		Employee obj1=(Employee) context.getBean("emp1");
		obj1.usecom();
		
		System.out.println("now using the qualifer primary in xml");
		
		System.out.println("setting the laptop class as primary when threi si bytye in xml");
		Employee obj2=(Employee) context.getBean("emp2");
		obj2.usecom();
		
		
		
		
		
		

	}

}
