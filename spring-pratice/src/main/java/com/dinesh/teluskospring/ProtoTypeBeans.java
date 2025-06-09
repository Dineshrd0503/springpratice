package com.dinesh.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoTypeBeans {
	public static void main(String[] args) {
		System.out.println("now using prototype bean for stdunet class");
		System.out.println("two objects will have two diff ages");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student obj1=(Student) context.getBean("student1");
		obj1.age=30;
		obj1.getage();
		System.out.println("second object age is ");
		Student obj2=(Student) context.getBean("student");
		obj2.getage();
		
		System.out.println("here a every time a object is created at every intlaization time and erveytime this same objcet i sused");
		System.out.println("this si example of prototype class");
	}

}
