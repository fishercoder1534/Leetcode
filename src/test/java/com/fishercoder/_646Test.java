package com.fishercoder;

import com.fishercoder.solutions._646;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _646Test {

    private static _646 test;
    private static int[][] pairs;

    @BeforeClass
    public static void setup() {
        test = new _646();
    }

    @Test
    public void test1() {
        pairs = new int[][]{
                {1,2},
                {2,3},
                {5,6},
                {3,4}
        };
        assertEquals(3, test.findLongestChain(pairs));
    }

    @Test
    public void test2() {
        pairs = new int[][]{
                {9,10},
                {-9,9},
                {-6,1},
                {-4,1},
                {8,10},
                {7,10},
                {9,10},
                {2,10}
        };
        assertEquals(2, test.findLongestChain(pairs));
    }

}