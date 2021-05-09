/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 6:39 PM
 *   File: Department.java
 */

package com.example.aotowire.xml;

import java.util.Objects;

public class Department {
    String name;
    long turnOver;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", turnOver=" + turnOver +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getTurnOver() == that.getTurnOver() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTurnOver());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(long turnOver) {
        this.turnOver = turnOver;
    }

    public Department() {
    }

    public Department(String name, long turnOver) {
        this.name = name;
        this.turnOver = turnOver;
    }
}