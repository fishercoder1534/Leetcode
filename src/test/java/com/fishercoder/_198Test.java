package com.fishercoder;

import com.fishercoder.solutions._198;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _198Test {
    private static _198.Solution1 solution1;
    private static _198.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _198.Solution1();
        solution2 = new _198.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.rob(new int[]{1, 2, 3, 1}));
        assertEquals(4, solution2.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.rob(new int[]{2, 1, 1, 2}));
    }

}