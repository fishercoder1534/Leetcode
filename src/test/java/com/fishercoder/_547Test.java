package com.fishercoder;

import com.fishercoder.solutions._547;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/9/17.
 */
public class _547Test {
    private static _547.Solution1 test;
    private static int expected;
    private static int actual;
    private static int[][] M;

    @BeforeClass
    public static void setup() {
        test = new _547.Solution1();
    }

    @Test
    public void test1() {
        M = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
        };
        expected = 2;
        actual = test.findCircleNum(M);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        M = new int[][]{
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1},
        };
        expected = 1;
        actual = test.findCircleNum(M);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        M = new int[][]{
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1},
        };
        expected = 1;
        actual = test.findCircleNum(M);
        assertEquals(expected, actual);
    }
}
