/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/9/2021
 *   Time: 4:20 PM
 *   File: Address.java
 */

package com.example.ref;

import java.util.Objects;

public class Address {
    String city;
    String state;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getPinCode() == address.getPinCode() && getCity().equals(address.getCity()) && getState().equals(address.getState()) && getCountry().equals(address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getState(), getCountry(), getPinCode());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public Address() {
        super();
    }

    public Address(String city, String state, String country, long pinCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    String country;
    long pinCode;
}