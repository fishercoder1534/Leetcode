package com.fishercoder;

import com.fishercoder.solutions._1574;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1574Test {
    private static _1574.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1574.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 2, 3, 10, 4, 2, 3, 5};
        assertEquals(3, solution1.findLengthOfShortestSubarray(arr));
    }

}