package com.fishercoder;

import com.fishercoder.solutions._646;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _646Test {

    private static _646.Solution1 solution1;
    private static int[][] pairs;

    @BeforeClass
    public static void setup() {
        solution1 = new _646.Solution1();
    }

    @Test
    public void test1() {
        pairs = new int[][]{
                {1, 2},
                {2, 3},
                {5, 6},
                {3, 4}
        };
        assertEquals(3, solution1.findLongestChain(pairs));
    }

    @Test
    public void test2() {
        pairs = new int[][]{
                {9, 10},
                {-9, 9},
                {-6, 1},
                {-4, 1},
                {8, 10},
                {7, 10},
                {9, 10},
                {2, 10}
        };
        assertEquals(2, solution1.findLongestChain(pairs));
    }

}