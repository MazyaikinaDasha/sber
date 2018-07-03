package com.company.entity;
import org.junit.Test;

import static org.junit.Assert.*;

public class iddTest {

    @Test
    public void getId() {
        idd d = new idd(78348228);
        assertEquals(78348228, d.getId());
    }

    @Test
    public void setId() {
        idd d = new idd(78348228);
        d.setId(4416723);
        assertEquals(4416723, d.getId());
    }
}