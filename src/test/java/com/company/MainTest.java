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
    public void  getFriendId (){
        Main c = new Main();
       try{
           c.getFriendId("78348228","4416723");
       }
       catch (Throwable cause) {
           cause.printStackTrace();
       }
   }
}