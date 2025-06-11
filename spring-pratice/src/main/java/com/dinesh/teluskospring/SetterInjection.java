package com.dinesh.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    public static void main(String[] args) {
        System.out.println("Using the property tags of xml to set value sal");
        System.out.println("Trying on employee class to get sal");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Employee emp = (Employee) context.getBean("emp");
        System.out.println("Sal of employee is " + emp.getSal());
        
        System.out.println("Now using a laptop class as a reference ref attribute of xml");
        emp.useLaptop();
        
      
    }
}