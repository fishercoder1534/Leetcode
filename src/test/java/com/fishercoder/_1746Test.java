package com.fishercoder;

import com.fishercoder.solutions._1746;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1746Test {
    private static _1746.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1746.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(17, solution1.maxSumAfterOperation(new int[]{2, -1, -4, -3}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.maxSumAfterOperation(new int[]{1, -1, 1, 1, -1, -1, 1}));
    }

    @Test
    public void test3() {
        assertEquals(1936, solution1.maxSumAfterOperation(new int[]{-44}));
    }

    @Test
    public void test4() {
        assertEquals(10954, solution1.maxSumAfterOperation(new int[]{29, 71, -52, -23, -28, 50, 27, 29, 0, 50,
                        -92, 22, -38, 90, 3, 6, 70, -56, -7, 40, 79, 98, 72, 88, -5, -78, 12, 69, 30,
                        -73, 99, -59, 33, 0, -6, 25, 87, -93, 20, -89, -22, 80, 57, 51, 48, 0, 65, -57,
                        -57, 28, -42, -97, 97, -49, 38, 40, -41, 3, 31, -12, 47, -10, 17, -32, 68, 40,
                        55, 86, -99, -2, 100, 89, 31, -67}));
    }

}
