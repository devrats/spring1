/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 4:21 PM
 *   File: Main.java
 */

package com.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        System.out.println("context.getBean(\"student\") = " + context.getBean("student"));
        System.out.println("context.getBean(\"student\") = " + context.getBean("student1"));
        System.out.println("context.getBean(\"student\") = " + context.getBean("student2"));
    }
}