package com.fishercoder;

import com.fishercoder.solutions._1823;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1823Test {
    private static _1823.Solution1 solution1;
    private static _1823.Solution2 solution2;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1823.Solution1();
        solution2 = new _1823.Solution2();
    }

    @Test
    public void test1() {
        expected = 1;
        assertEquals(expected, solution1.findTheWinner(6, 5));
        assertEquals(expected, solution2.findTheWinner(6, 5));
    }

}