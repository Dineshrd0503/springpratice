package com.dinesh.teluskospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class XMLBasedConfigDemo {
	public static void main(String[] args) {
		System.out.println("using the aditional bean factory");
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("using the xml based notation to get otuput");
		Alien obj=(Alien) factory.getBean("alien");
		obj.code();
		
		System.out.println("added age filed to the stdunet class");
		Student obj1=(Student)factory.getBean("student");
		obj1.age=30;
		obj1.getage();
		
		System.out.println("two diff objects of spring conatiner wioo refer to the same content");
		System.out.println("this si the 2nd object");
		Student obj2=(Student)factory.getBean("student");
		obj2.getage();
		
		System.out.println("here a single object is created at intlaization time and erveytime this same objcet i sused");
		System.out.println("this si example of singeton class");
		
		
		
		
	}
	

}
