package com.fishercoder;

import com.fishercoder.solutions._1550;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1550Test {
    private static _1550.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1550.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{2, 6, 4, 1};
        assertEquals(false, solution1.threeConsecutiveOdds(arr));
    }

}