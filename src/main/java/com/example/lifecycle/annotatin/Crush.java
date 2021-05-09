/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 5:38 PM
 *   File: Crush.java
 */

package com.example.lifecycle.annotatin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

public class Crush {
    String name;

    @Override
    public String toString() {
        return "Crush{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Crush)) return false;
        Crush crush = (Crush) o;
        return Objects.equals(getName(), crush.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crush() {
        super();
    }

    public Crush(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("I am " + this.getName() + " and I am devvrat 's crush");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("I am " + this.getName() + " and devvrat is not my crush");
    }
}