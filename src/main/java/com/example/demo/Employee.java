/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/5/2021
 *   Time: 5:49 PM
 *   File: Employee.java
 */

package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {

    List<String> phone = new ArrayList<>();

    @Override
    public String toString() {
        return "phone=" + phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getPhone().equals(employee.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhone());
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Employee(List<String> phone) {
        this.phone = phone;
    }
}