package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._393;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class _393Test {
    private _393.Solution1 solution1;
    private static boolean expected;
    private static boolean actual;
    private static int[] data;

    @BeforeEach
    public void setUp() {
        solution1 = new _393.Solution1();
    }

    @Test
    @Disabled
    public void test1() {
        data = new int[] {197, 130, 1};
        expected = true;
        actual = solution1.validUtf8(data);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        data = new int[] {5};
        expected = true;
        actual = solution1.validUtf8(data);
        assertEquals(expected, actual);
    }
}
