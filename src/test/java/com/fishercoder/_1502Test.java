package com.fishercoder;

import com.fishercoder.solutions._1502;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1502Test {
    private static _1502.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1502.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{3, 5, 1};
        assertEquals(true, solution1.canMakeArithmeticProgression(arr));
    }

}