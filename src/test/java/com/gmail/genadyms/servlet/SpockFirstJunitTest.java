package com.gmail.genadyms.servlet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gennady.mazurkevich on 06.06.2017.
 */
public class SpockFirstJunitTest {
    String fname = "Vasya";
    String lname = "Petrov";
    String fullName = lname + " " + fname;

    @Test
    public void testGetFullName() {
        SpockFirst sf = new SpockFirst();
        sf.setFirstName(fname);
        sf.setLastName(lname);
        Assert.assertEquals(sf.getFullName(), fullName);
    }

    @Test
    public void testGetFullNameFailure() {
        SpockFirst sf = new SpockFirst();
        sf.setFirstName(fname);
        sf.setLastName(lname);
        Assert.assertNotEquals(sf.getFullName(), "test");
    }
}
