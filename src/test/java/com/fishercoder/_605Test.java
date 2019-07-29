package com.fishercoder;

import com.fishercoder.solutions._605;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _605Test {
    private static _605.Solution1 solution1;
    private static _605.Solution2 solution2;
    private static int[] flowerbed;
    private static int n;

    @BeforeClass
    public static void setup() {
        solution1 = new _605.Solution1();
        solution2 = new _605.Solution2();
    }

    @Test
    public void test1() {
        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 1;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test2() {
        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 2;
        assertEquals(false, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test3() {
        flowerbed = new int[]{1, 0, 0, 0, 0, 1};
        n = 2;
        assertEquals(false, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test4() {
        flowerbed = new int[]{1, 0, 1, 0, 1, 0, 1};
        n = 1;
        assertEquals(false, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test5() {
        flowerbed = new int[]{0, 0, 1, 0, 1};
        n = 1;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test6() {
        flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        n = 2;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test7() {
        flowerbed = new int[]{0, 0, 1, 0, 0};
        n = 2;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test8() {
        flowerbed = new int[]{1};
        n = 0;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test9() {
        flowerbed = new int[]{0};
        n = 0;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test10() {
        flowerbed = new int[]{0};
        n = 1;
        assertEquals(true, solution1.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test11() {
        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 1;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test12() {
        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 2;
        assertEquals(false, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test13() {
        flowerbed = new int[]{1, 0, 0, 0, 0, 1};
        n = 2;
        assertEquals(false, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test14() {
        flowerbed = new int[]{1, 0, 1, 0, 1, 0, 1};
        n = 1;
        assertEquals(false, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test15() {
        flowerbed = new int[]{0, 0, 1, 0, 1};
        n = 1;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test16() {
        flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        n = 2;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test17() {
        flowerbed = new int[]{0, 0, 1, 0, 0};
        n = 2;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test18() {
        flowerbed = new int[]{1};
        n = 0;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test19() {
        flowerbed = new int[]{0};
        n = 0;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test20() {
        flowerbed = new int[]{0};
        n = 1;
        assertEquals(true, solution2.canPlaceFlowers(flowerbed, n));
    }
}
