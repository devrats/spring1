/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/11/2021
 *   Time: 5:04 PM
 *   File: Main.java
 */

package com.example.springjdbc.withxoutml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        System.out.println(studentDao.showAll());
    }

}