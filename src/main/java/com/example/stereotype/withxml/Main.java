/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/10/2021
 *   Time: 8:35 PM
 *   File: Main.java
 */

package com.example.stereotype.withxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        System.out.println("context.getBean(\"friend\") = " + context.getBean("with"));
    }
}