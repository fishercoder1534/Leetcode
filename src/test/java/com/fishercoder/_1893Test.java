package com.fishercoder;

import com.fishercoder.solutions._1893;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1893Test {
    private static _1893.Solution1 solution1;
    private static int[][] ranges;

    @BeforeClass
    public static void setup() {
        solution1 = new _1893.Solution1();
    }

    @Test
    public void test1() {
        ranges = new int[][]{
                {1, 10},
                {10, 20}
        };
        assertEquals(false, solution1.isCovered(ranges, 21, 21));
    }

    @Test
    public void test2() {
        ranges = new int[][]{
                {50, 50}
        };
        assertEquals(false, solution1.isCovered(ranges, 1, 50));
    }

    @Test
    public void test3() {
        ranges = new int[][]{
                {1, 10},
                {10, 20}
        };
        assertEquals(false, solution1.isCovered(ranges, 21, 25));
    }

    @Test
    public void test4() {
        ranges = new int[][]{
                {1, 50}
        };
        assertEquals(true, solution1.isCovered(ranges, 1, 50));
    }

    @Test
    public void test5() {
        ranges = new int[][]{
                {1, 2}, {3, 4}, {5, 6}
        };
        assertEquals(true, solution1.isCovered(ranges, 2, 5));
    }

    @Test
    public void test6() {
        ranges = new int[][]{
                {50, 50}
        };
        assertEquals(false, solution1.isCovered(ranges, 49, 49));
    }

}