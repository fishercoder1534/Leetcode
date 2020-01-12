package com.fishercoder;

import com.fishercoder.solutions._1085;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1085Test {
    private static _1085.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1085.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.sumOfDigits(new int[]{34, 23, 1, 24, 75, 33, 54, 8}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.sumOfDigits(new int[]{99, 77, 33, 66, 55}));
    }
}
