package com.fishercoder;

import com.fishercoder.solutions._575;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/6/17.
 */
public class _575Test {
    private static _575.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] candies;

    @BeforeClass
    public static void setup() {
        solution1 = new _575.Solution1();
    }

    @Test
    public void test1() {
        candies = new int[]{1, 1, 2, 3};
        expected = 2;
        actual = solution1.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        candies = new int[]{1, 1, 2, 2, 3, 3};
        expected = 3;
        actual = solution1.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        candies = new int[]{1000, 1, 1, 1};
        expected = 2;
        actual = solution1.distributeCandies(candies);
        assertEquals(expected, actual);
    }
}
