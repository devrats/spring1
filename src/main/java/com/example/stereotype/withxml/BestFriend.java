/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/10/2021
 *   Time: 7:14 PM
 *   File: BestFriend.java
 */

package com.example.stereotype.withxml;

import java.util.Objects;

public class BestFriend {
    private String name;

    @Override
    public String toString() {
        return "BestFriend{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BestFriend)) return false;
        BestFriend that = (BestFriend) o;
        return Objects.equals(getName(), that.getName());
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

    public BestFriend() {
        super();
    }

    public String doLove(){
        System.out.println("I am  " + this.getName() + " and I love Devvrat");
        return this.getName();
    }

    public static String best() {
        System.out.println("I am devvrat 's best friend");
        return null;
    }

    public BestFriend(String name) {
        this.name = name;
    }
}