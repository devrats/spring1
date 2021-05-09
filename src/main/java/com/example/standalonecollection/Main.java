/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 7:33 PM
 *   File: Main.java
 */

package com.example.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        System.out.println("context.getBean(\"person\") = " + context.getBean("person"));
    }
}