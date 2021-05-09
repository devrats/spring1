/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 7:19 PM
 *   File: Person.java
 */

package com.example.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Person {
    List friend;
    Map<String, String> relation;

    @Override
    public String toString() {
        return "Person{" +
                "friend=" + friend +
                ", relation=" + relation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFriend(), person.getFriend()) && Objects.equals(getRelation(), person.getRelation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFriend(), getRelation());
    }

    public Map getRelation() {
        return relation;
    }

    public void setRelation(Map relation) {
        this.relation = relation;
    }

    public Person(List friend, Map relation) {
        this.friend = friend;
        this.relation = relation;
    }

    public List getFriend() {
        return friend;
    }

    public void setFriend(List friend) {
        this.friend = friend;
    }

    public Person() {
    }

    public Person(List friend) {
        this.friend = friend;
    }
}