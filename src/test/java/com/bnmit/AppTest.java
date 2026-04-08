package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testGreatest1() {
        assertEquals(9, App.findGreatest(5, 9, 3));
    }

    @Test
    void testGreatest2() {
        assertEquals(7, App.findGreatest(7, 2, 1));
    }

    @Test
    void testGreatest3() {
        assertEquals(10, App.findGreatest(4, 10, 6));
    }
}