/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/17/2021
 *   Time: 4:41 PM
 *   File: Main.java
 */

package com.example.hibernatespring;


import com.example.mine.Mine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("dao");
        //Employee employee = new Employee("devvrat sharma","computer science",36_00_000,new Mine().getName());
        //dao.insert(employee);
    }
}