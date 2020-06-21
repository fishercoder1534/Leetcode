package com.fishercoder;

import com.fishercoder.solutions._1481;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1481Test {
    private static _1481.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1481.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{5, 5, 4};
        assertEquals(1, solution1.findLeastNumOfUniqueInts(arr, 1));
    }

}