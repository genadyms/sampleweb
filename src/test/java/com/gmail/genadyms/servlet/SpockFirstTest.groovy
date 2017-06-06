package com.gmail.genadyms.servlet

import spock.lang.Specification

class SpockFirstTest extends Specification {

    def "test getFullName method"() {
        given:
        def fname = "world!";
        def lname = "Hello";

        when:
        def sf = new SpockFirst();
        sf.setFirstName(fname);
        sf.setLastName(lname);
        then:
        sf.getFullName().equals(lname+" "+fname);
    }

    def "my first spock test " () {

    }
}
