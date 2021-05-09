/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 6:25 PM
 *   File: Employee.java
 */

package com.example.aotowire.xml;

import java.util.Objects;

public class Employee {
    Family family;

    @Override
    public String toString() {
        return "Employee{" +
                "family=" + family +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFamily(), employee.getFamily()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamily(), getDepartment());
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(Family family, Department department) {
        this.family = family;
        this.department = department;
    }

    Department department;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Employee() {
    }

    public Employee(Family family) {
        this.family = family;
    }
}