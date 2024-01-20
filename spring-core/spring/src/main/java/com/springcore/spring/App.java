package com.springcore.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 * to use DI first create config.xml file 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //without creating object using dependency injection
        
        ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
        Student student1 = (Student)context.getBean("student1");
        System.out.println(student1);
        
        Student stud2 = (Student)context.getBean("student2");
        System.out.println(stud2);
    }
}
