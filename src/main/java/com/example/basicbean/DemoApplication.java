package com.example.basicbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("context.getBean(\"student1\") = " + context.getBean("student1"));
        System.out.println("context.getBean(\"student2\") = " + context.getBean("student2"));
        System.out.println("context.getBean(\"student3\") = " + context.getBean("student3"));
        System.out.println("context.getBean(\"employee\") = " + context.getBean("employee"));
        System.out.println("context.getBean(\"person\") = " + context.getBean("person"));
        System.out.println("context.getBean(\"person2\") = " + context.getBean("person2"));
        SpringApplication.run(DemoApplication.class, args);
    }
}