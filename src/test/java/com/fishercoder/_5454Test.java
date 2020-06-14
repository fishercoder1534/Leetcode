package com.fishercoder;

import com.fishercoder.solutions._5454;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _5454Test {
    private static _5454.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _5454.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{5, 5, 4};
        assertEquals(1, solution1.findLeastNumOfUniqueInts(arr, 1));
    }

}