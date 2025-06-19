package com.dinesh.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("now using constructor injection");
		System.out.println("in the alien class calling the parametrized constructor with age 15");
		System.out.println("adding construcot-arg argumen in alien bag of xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("src/main/spring.xml");
		System.out.println("creating alien object and calling age constrcuto");
		Alien obj=(Alien) context.getBean("alien1");
		System.out.println("age is "+obj.age);
		

	}

}
