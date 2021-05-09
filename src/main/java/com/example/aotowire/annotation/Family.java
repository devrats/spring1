/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 6:25 PM
 *   File: Family.java
 */

package com.example.aotowire.annotation;

import java.util.Objects;

public class Family {
    String mother;
    String father;
    String wife;
    String child;

    @Override
    public String toString() {
        return "Family{" +
                "mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", wife='" + wife + '\'' +
                ", child='" + child + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Objects.equals(getWife(), family.getWife()) && Objects.equals(getChild(), family.getChild());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), getWife(), getChild());
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public Family() {
        super();
    }

    public Family(String mother, String father, String wife, String child) {
        this.mother = mother;
        this.father = father;
        this.wife = wife;
        this.child = child;
    }
}