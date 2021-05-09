/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 5:09 PM
 *   File: Main.java
 */

package com.example.lifecycle.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeconfig.xml");
        System.out.println("context.getBean(\"friend\") = " + context.getBean("friend"));
        System.out.println("context.getBean(\"life\") = " + context.getBean("life"));
        System.out.println("context.getBean(\"crush\") = " + context.getBean("crush"));
        context.registerShutdownHook();
    }
}