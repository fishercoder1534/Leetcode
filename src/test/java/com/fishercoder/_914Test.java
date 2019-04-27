package com.fishercoder;

import com.fishercoder.solutions._914;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _914Test {
    private static _914.Solution1 solution1;
    private int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _914.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{1};
        assertEquals(false, solution1.hasGroupsSizeX(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{1,1};
        assertEquals(true, solution1.hasGroupsSizeX(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{1,1,1,1,2,2,2,2,2,2};
        assertEquals(true, solution1.hasGroupsSizeX(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{1,1,1,2,2,2,3,3};
        assertEquals(false, solution1.hasGroupsSizeX(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{0,0,1,1,1,1,2,2,3,4};
        assertEquals(false, solution1.hasGroupsSizeX(arr));
    }

    @Test
    public void test6() {
        arr = new int[]{1,2,3,4,4,3,2,1};
        assertEquals(true, solution1.hasGroupsSizeX(arr));
    }
}