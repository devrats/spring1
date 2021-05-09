/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 4:55 PM
 *   File: Friend.java
 */

package com.example.lifecycle.xml;

import java.util.Objects;

public class Friend {
    String name;

    public Friend() {
        super();
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;
        Friend friend = (Friend) o;
        return Objects.equals(getName(), friend.getName());
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

    public Friend(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("I am " + this.getName() + " and I am devvrat 's friend.");
    }

    public void destroy(){
        System.out.println("I am " + this.getName() + " and I am no more friend with devvrat.");
    }
}