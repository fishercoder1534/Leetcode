package com.fishercoder;

import com.fishercoder.solutions._1426;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1426Test {
    private static _1426.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1426.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1, 1, 3, 3, 5, 5, 7, 7};
        assertEquals(0, solution1.countElements(arr));
    }

}