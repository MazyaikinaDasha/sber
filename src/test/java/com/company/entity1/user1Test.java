package com.company.entity1;
import org.junit.Test;
import static org.junit.Assert.*;

public class user1Test {
    @Test
    public void getResponse() {
        user[] a = new user[2];
        user us = new  user( 123, "Ivan", "Ivanov");
        a[0]=us;
        user us1 = new user(321, "Vasya", "Pupkin");
        a[1] = us1;
        user1 b= new user1(a);
        assertEquals(a, b.getResponse());
    }

    @Test
    public void setResponse() {
        user[] a = new user[2];
        user us = new  user( 123, "Ivan", "Ivanov");
        a[0]=us;
        user us1 = new user(321, "Vasya", "Pupkin");
        a[1] = us1;
        user1 b= new user1(a);
        user[] s = new user[1];
        user u = new  user( 111, "Vasya", "Ivanov");
        s[0]=u;
        b.setResponse(s);
        assertEquals(s, b.getResponse());
    }
}