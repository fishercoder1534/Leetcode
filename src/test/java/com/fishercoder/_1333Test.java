package com.fishercoder;

import com.fishercoder.solutions._1333;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1333Test {
    private static _1333.Solution1 solution1;
    private static int[][] restaurants;

    @BeforeClass
    public static void setup() {
        solution1 = new _1333.Solution1();
    }

    @Test
    public void test1() {
        restaurants = new int[][]{
                {1, 4, 1, 40, 10},
                {2, 8, 0, 50, 5},
                {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3},
                {5, 1, 1, 15, 1}
        };
        assertEquals(Arrays.asList(3, 1, 5), solution1.filterRestaurants(restaurants, 1, 50, 10));
    }

    @Test
    public void test2() {
        restaurants = new int[][]{
                {1, 4, 1, 40, 10},
                {2, 8, 0, 50, 5},
                {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3},
                {5, 1, 1, 15, 1}
        };
        assertEquals(Arrays.asList(4, 3, 2, 1, 5), solution1.filterRestaurants(restaurants, 0, 50, 10));
    }

    @Test
    public void test3() {
        restaurants = new int[][]{
                {1, 4, 1, 40, 10},
                {2, 8, 0, 50, 5},
                {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3},
                {5, 1, 1, 15, 1}
        };
        assertEquals(Arrays.asList(4, 5), solution1.filterRestaurants(restaurants, 0, 30, 3));
    }

}