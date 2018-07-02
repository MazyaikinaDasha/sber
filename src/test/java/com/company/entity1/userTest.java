package com.company.entity1;

import com.company.entity1.user;
import org.junit.Test;

import static org.junit.Assert.*;

public class userTest {

    @Test
    public void getId() {
        user a = new user(123, "Ivan","Ivanov");
        assertEquals(123,a.getId());
    }

    @Test
    public void getFist_name() {
        user a = new user(123, "Ivan","Ivanov");
        assertEquals("Ivan",a.getFist_name());

    }

    @Test
    public void getLast_name() {
        user a = new user(123, "Ivan","Ivanov");
        assertEquals("Ivanov",a.getLast_name());
    }

    @Test
    public void setFist_name() {
        user a = new user(123, "Ivan","Ivanov");
        a.setId(321);
        assertEquals(321,a.getId());
    }

    @Test
    public void setId() {
        user a = new user(123, "Ivan","Ivanov");
        a.setFist_name("Vasya");
        assertEquals("Vasya",a.getFist_name());
    }

    @Test
    public void setLast_name() {
        user a = new user(123, "Ivan","Ivanov");
        a.setLast_name("Pupkin");
        assertEquals("Pupkin",a.getLast_name());

    }
}