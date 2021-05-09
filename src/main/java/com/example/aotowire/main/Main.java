/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 6:36 PM
 *   File: Main.java
 */

package com.example.aotowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aotowireconfig.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("autowireconfig.xml");
        System.out.println("context.getBean(\"employee\") = " + context.getBean("employee"));
        System.out.println("context.getBean(\"employee\") = " + context.getBean("employee1"));
        System.out.println("context.getBean(\"employee\") = " + context.getBean("employee2"));
        System.out.println("context.getBean(\"employee\") = " + context1.getBean("employee"));
    }
}