package com.fishercoder;

import com.fishercoder.solutions._1539;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1539Test {
    private static _1539.Solution1 solution1;
    private static _1539.Solution2 solution2;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1539.Solution1();
        solution2 = new _1539.Solution2();
    }

    @Test
    public void test1() {
        arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, solution1.findKthPositive(arr, 5));
    }

    @Test
    public void test2() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution1.findKthPositive(arr, 2));
    }

    @Test
    public void test3() {
        arr = new int[]{2, 3, 4, 7, 11};
        assertEquals(9, solution2.findKthPositive(arr, 5));
    }

    @Test
    public void test4() {
        arr = new int[]{1, 2, 3, 4};
        assertEquals(6, solution2.findKthPositive(arr, 2));
    }

}