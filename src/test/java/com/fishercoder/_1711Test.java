package com.fishercoder;

import com.fishercoder.solutions._1711;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1711Test {
    private static _1711.Solution1 solution1;
    private static int[] deliciousness;

    @BeforeClass
    public static void setup() {
        solution1 = new _1711.Solution1();
    }

    @Test
    public void test1() {
        deliciousness = new int[]{1, 3, 5, 7, 9};
        assertEquals(4, solution1.countPairs(deliciousness));
    }

    @Test
    public void test2() {
        deliciousness = new int[]{1, 1, 1, 3, 3, 3, 7};
        assertEquals(15, solution1.countPairs(deliciousness));
    }

    @Test
    public void test3() {
        deliciousness = new int[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64};
        assertEquals(528, solution1.countPairs(deliciousness));
    }

}