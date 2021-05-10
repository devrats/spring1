/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/10/2021
 *   Time: 8:56 PM
 *   File: Man.java
 */

package com.example.prototype;

import java.util.Objects;

public class Man {
    String name;

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }
}