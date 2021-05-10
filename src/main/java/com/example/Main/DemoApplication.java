package com.example.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        ApplicationContext aotoWire = new ClassPathXmlApplicationContext("aotowireconfig.xml");
        ApplicationContext autoWire = new ClassPathXmlApplicationContext("autowireconfig.xml");
        System.out.println("aotoWire.getBean(\"employee\") = " + aotoWire.getBean("employee"));
        System.out.println("aotoWire.getBean(\"employee\") = " + aotoWire.getBean("employee1"));
        System.out.println("aotoWire.getBean(\"employee\") = " + aotoWire.getBean("employee2"));
        System.out.println("autoWire.getBean(\"employee\") = " + autoWire.getBean("employee"));
        AbstractApplicationContext lifeCycle = new ClassPathXmlApplicationContext("lifeconfig.xml");
        System.out.println("lifeCycle.getBean(\"friend\") = " + lifeCycle.getBean("friend"));
        System.out.println("lifeCycle.getBean(\"life\") = " + lifeCycle.getBean("life"));
        System.out.println("lifeCycle.getBean(\"crush\") = " + lifeCycle.getBean("crush"));
        lifeCycle.registerShutdownHook();
        ApplicationContext reference = new ClassPathXmlApplicationContext("refconfig.xml");
        System.out.println("reference.getBean(\"student\") = " + reference.getBean("student"));
        System.out.println("reference.getBean(\"student\") = " + reference.getBean("student1"));
        System.out.println("reference.getBean(\"student\") = " + reference.getBean("student2"));
        ApplicationContext standAloneCollection = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        System.out.println("standAloneCollection.getBean(\"person\") = " + standAloneCollection.getBean("person"));
    }
}