package com.company;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void  isNumeric (){
        Main c = new Main();
        assertEquals(true, c.isNumeric("1"));
    }
   @Test
    public void  getfriendid (){
        Main c = new Main();
        int [] a = new int[5];
        a[0] = 678029;
        a[1] = 7032926;
        a[2] = 7135101;
        a[3] = 21607115;
        a[4] = 30668720;
       assertEquals(a[0], c.getfriendid("78348228","4416723")[0]);
       assertEquals(a[1], c.getfriendid("78348228","4416723")[1]);
       assertEquals(a[2], c.getfriendid("78348228","4416723")[2]);
       assertEquals(a[3], c.getfriendid("78348228","4416723")[3]);
       assertEquals(a[4], c.getfriendid("78348228","4416723")[4]);

   }
}