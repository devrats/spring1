/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/10/2021
 *   Time: 8:59 PM
 *   File: Main.java
 */

package com.example.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");
        Man man = (Man) context.getBean("man");
        Man man1 = (Man) context.getBean("man");
        System.out.println(man.hashCode());
        System.out.println(man1.hashCode());
        Man man2 = (Man) context.getBean("man1");
        Man man3 = (Man) context.getBean("man1");
        System.out.println(man2.hashCode());
        System.out.println(man3.hashCode());

    }
}