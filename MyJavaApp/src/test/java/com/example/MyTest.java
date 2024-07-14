package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest {

    @Test
    public void testAdd() {
        MyApp app = new MyApp();
        int result = app.add(3, 4);
        assertEquals(7, result);
    }
}
