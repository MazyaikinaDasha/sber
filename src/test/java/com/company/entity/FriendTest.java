package com.company.entity;

import com.company.entity.Friend;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {

    @Test
    public void getResponse() {
       int[] a={7,0,9};
        Friend f = new Friend(a);
        assertEquals(a, f.getResponse());
    }

    @Test
    public void setResponse() {
        int[] a={7,0,9};
        Friend f = new Friend(a);
        int[] b={7,8,0};
        f.setResponse(b);
        assertEquals(b, f.getResponse());

    }
}