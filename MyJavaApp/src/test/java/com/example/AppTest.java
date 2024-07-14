package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(3, 4);
        assertEquals(7, result);
        int result1 = app.sub(30, 4);
        assertEquals(26, result1);
        int result2 = app.mul(3, 4);
        assertEquals(12, result2);
        int result3 = app.div(16, 4);
        assertEquals(4, result3);
    }
}
