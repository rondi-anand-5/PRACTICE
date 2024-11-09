package com.nt.PRACTICE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    App a;

    @Test
    public void testSumWithValue() {
        int v = 10;
        int b = 12;
        int expected = 22;
        int actual = sum(v, b);
        assertEquals(expected, actual);
    }

    private int sum(int v, int b) {
        return v + b;
    }
}
