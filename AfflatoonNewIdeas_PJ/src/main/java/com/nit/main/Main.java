package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Student;

public class Main {

    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	
    Student student = context.getBean("student",Student.class);
    
    student.displayStudent();
    	

      
    }
}