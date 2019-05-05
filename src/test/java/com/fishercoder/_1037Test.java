package com.fishercoder;

import com.fishercoder.solutions._1037;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _1037Test {
    private static _1037.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1037.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isBoomerang(new int[][]{new int[]{1, 1}, new int[]{2, 3}, new int[]{3, 2}}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isBoomerang(new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{3, 3}}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isBoomerang(new int[][]{new int[]{0, 0}, new int[]{0, 2}, new int[]{2, 1}}));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isBoomerang(new int[][]{new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 1}}));
    }

}