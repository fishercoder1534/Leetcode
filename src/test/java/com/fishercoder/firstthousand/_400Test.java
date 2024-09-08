package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._400;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _400Test {
    private _400.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int n;

    @BeforeEach
    public void setUp() {
        solution1 = new _400.Solution1();
    }

    @Test
    public void test1() {
        n = 11;
        expected = 0;
        actual = solution1.findNthDigit(n);
        assertEquals(expected, actual);
    }
}
