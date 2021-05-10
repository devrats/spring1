package com.example.basicbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext basicBean = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("basicBean.getBean(\"student1\") = " + basicBean.getBean("student1"));
        System.out.println("basicBean.getBean(\"student2\") = " + basicBean.getBean("student2"));
        System.out.println("basicBean.getBean(\"student3\") = " + basicBean.getBean("student3"));
        System.out.println("basicBean.getBean(\"employee\") = " + basicBean.getBean("employee"));
        System.out.println("basicBean.getBean(\"person\") = " + basicBean.getBean("person"));
        System.out.println("basicBean.getBean(\"person2\") = " + basicBean.getBean("person2"));
        SpringApplication.run(DemoApplication.class, args);
    }
}