package com.fishercoder;

import com.fishercoder.solutions._1534;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1534Test {
    private static _1534.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1534.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{3, 0, 1, 1, 9, 7};
        assertEquals(4, solution1.countGoodTriplets(arr, 7, 2, 3));
    }

}