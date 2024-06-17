package com.fishercoder;

import com.fishercoder.solutions.secondthousand._1300;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1300Test {
    private static _1300.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1300.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{4, 9, 3};
        assertEquals(3, solution1.findBestValue(arr, 10));
    }

    @Test
    public void test2() {
        arr = new int[]{2, 3, 5};
        assertEquals(5, solution1.findBestValue(arr, 10));
    }

    @Test
    public void test3() {
        arr = new int[]{60864, 25176, 27249, 21296, 20204};
        assertEquals(11361, solution1.findBestValue(arr, 56803));
    }

    @Test
    public void test4() {
        arr = new int[]{2, 3, 5};
        assertEquals(5, solution1.findBestValue(arr, 11));
    }

    @Test
    public void test5() {
        arr = new int[]{60864, 25176, 27249, 21296, 20204};
        assertEquals(11361, solution1.findBestValue(arr, 56803));
    }

    @Test
    public void test6() {
        arr = new int[]{48772, 52931, 14253, 32289, 75263};
        assertEquals(8175, solution1.findBestValue(arr, 40876));
    }

    @Test
    public void test7() {
        arr = new int[]{1547, 83230, 57084, 93444, 70879};
        assertEquals(17422, solution1.findBestValue(arr, 71237));
    }

    @Test
    public void test8() {
        arr = new int[]{1, 1, 2};
        assertEquals(2, solution1.findBestValue(arr, 10));
    }

    @Test
    public void test9() {
        arr = new int[]{1, 1, 1};
        assertEquals(1, solution1.findBestValue(arr, 10));
    }

}
