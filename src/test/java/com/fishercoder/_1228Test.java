package com.fishercoder;

import com.fishercoder.solutions._1228;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1228Test {
    private static _1228.Solution1 solution1;
    private static _1228.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1228.Solution1();
        solution2 = new _1228.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.missingNumber(new int[]{5, 7, 11, 13}));
        assertEquals(9, solution2.missingNumber(new int[]{5, 7, 11, 13}));
    }

    @Test
    public void test2() {
        assertEquals(14, solution1.missingNumber(new int[]{15, 13, 12}));
        assertEquals(14, solution2.missingNumber(new int[]{15, 13, 12}));
    }

}