package com.gmail.genadyms.servlet;

import com.sun.javafx.binding.StringFormatter;

/**
 * Created by gennady.mazurkevich on 06.06.2017.
 */
public class SpockFirst {

    private String firstName;

    private String LastName;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }
}
