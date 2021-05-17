/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/17/2021
 *   Time: 4:41 PM
 *   File: Employee.java
 */

package com.example.hibernatespring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eId;

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", spouse='" + spouse + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return geteId() == employee.geteId() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getSpouse(), employee.getSpouse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(geteId(), getName(), getDepartment(), getSalary(), getSpouse());
    }

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String department, int salary, String spouse) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.spouse = spouse;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public Employee(int eId, String name, String department, int salary, String spouse) {
        this.eId = eId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.spouse = spouse;
    }

    private String name;
    private String department;
    private int salary;
    private String spouse;
}