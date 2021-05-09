/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 5:12 PM
 *   File: Life.java
 */

package com.example.lifecycle.interfacee;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Objects;

public class Life implements InitializingBean, DisposableBean {

    String name;

    @Override
    public String toString() {
        return "Life{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Life)) return false;
        Life life = (Life) o;
        return Objects.equals(getName(), life.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("me hu");
        this.name = name;
    }

    public Life() {
        super();
    }

    public Life(String name) {
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am " + this.getName() + " and I am no more devvrat 's life.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am " + this.getName() + " and I am devvrat 's life.");
    }
}