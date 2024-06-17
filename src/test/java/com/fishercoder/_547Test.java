package com.fishercoder;

import com.fishercoder.solutions.first_thousand._547;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 1/9/17.
 */
public class _547Test {
    private static _547.Solution1 test;
    private static int expected;
    private static int actual;
    private static int[][] isConnected;

    @BeforeEach
    public void setup() {
        test = new _547.Solution1();
    }

    @Test
    public void test1() {
        isConnected = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
        };
        expected = 2;
        actual = test.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        isConnected = new int[][]{
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1},
        };
        expected = 1;
        actual = test.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        isConnected = new int[][]{
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1},
        };
        expected = 1;
        actual = test.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        isConnected = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
        };
        expected = 3;
        actual = test.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }
}
