/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/10/2021
 *   Time: 7:14 PM
 *   File: Friend.java
 */

package com.example.stereotype.withxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component("with")
public class Friend {

    @Value("#{list12}")
    List<String> friend;

    @Value("12")
    int numberOfFriend;

    @Value("#{3>45}")
    Boolean isFriendGood;

    @Value("#{new com.example.stereotype.withxml.BestFriend(new com.example.mine.Mine().getName)}")
    BestFriend bestFriend;

    @Value("#{T(java.lang.Math).PI}")
    double pi;

    @Value("#{new com.example.stereotype.withxml.BestFriend(new com.example.mine.Mine().getName()).doLove()}")
    String doLove;

    @Value("#{T(com.example.stereotype.withxml.BestFriend).best()}")
    String best;

    @Override
    public String toString() {
        return "Friend{" +
                "friend=" + friend +
                ", numberOfFriend=" + numberOfFriend +
                ", isFriendGood=" + isFriendGood +
                ", bestFriend=" + bestFriend +
                ", pi=" + pi +
                ", doLove='" + doLove + '\'' +
                ", best='" + best + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;
        Friend friend1 = (Friend) o;
        return getNumberOfFriend() == friend1.getNumberOfFriend() && Double.compare(friend1.getPi(), getPi()) == 0 && Objects.equals(getFriend(), friend1.getFriend()) && Objects.equals(isFriendGood, friend1.isFriendGood) && Objects.equals(getBestFriend(), friend1.getBestFriend()) && Objects.equals(getDoLove(), friend1.getDoLove()) && Objects.equals(getBest(), friend1.getBest());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFriend(), getNumberOfFriend(), isFriendGood, getBestFriend(), getPi(), getDoLove(), getBest());
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public int getNumberOfFriend() {
        return numberOfFriend;
    }

    public void setNumberOfFriend(int numberOfFriend) {
        this.numberOfFriend = numberOfFriend;
    }

    public Boolean getFriendGood() {
        return isFriendGood;
    }

    public void setFriendGood(Boolean friendGood) {
        isFriendGood = friendGood;
    }

    public BestFriend getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(BestFriend bestFriend) {
        this.bestFriend = bestFriend;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getDoLove() {
        return doLove;
    }

    public void setDoLove(String doLove) {
        this.doLove = doLove;
    }

    public String getBest() {
        return best;
    }

    public void setBest(String best) {
        this.best = best;
    }

//    public Friend(List<String> friend, int numberOfFriend, Boolean isFriendGood, BestFriend bestFriend, double pi, String doLove, String best) {
//        this.friend = friend;
//        this.numberOfFriend = numberOfFriend;
//        this.isFriendGood = isFriendGood;
//        this.bestFriend = bestFriend;
//        this.pi = pi;
//        this.doLove = doLove;
//        this.best = best;
//    }
}