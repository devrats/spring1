/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 6:25 PM
 *   File: Employee.java
 */

package com.example.aotowire.annotation;

import com.example.aotowire.xml.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Objects;

public class Employee {
    @Autowired
    @Qualifier("family1")
    Family family;

    @Override
    public String toString() {
        return "Employee{" +
                "family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFamily(), employee.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamily());
    }

    public Family getFamily() {
        return family;
    }

    @Autowired
    public void setFamily(Family family) {
        this.family = family;
    }

    public Employee() {
    }

    public Employee(Family family) {
        this.family = family;
    }
}