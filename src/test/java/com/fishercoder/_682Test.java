package com.fishercoder;

import com.fishercoder.solutions._682;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _682Test {
    private static _682.Solution1 solution1;
    private static String[] ops;

    @BeforeClass
    public static void setup() {
        solution1 = new _682.Solution1();
    }

    @Test
    public void test1() {
        ops = new String[]{"5", "2", "C", "D", "+"};
        assertEquals(30, solution1.calPoints(ops));
    }

    @Test
    public void test2() {
        ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, solution1.calPoints(ops));
    }

}