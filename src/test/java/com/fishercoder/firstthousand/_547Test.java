package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._547;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by fishercoder on 1/9/17.
 */
public class _547Test {
    private _547.Solution1 solution1;
    private _547.Solution2 solution2;
    private static int expected;
    private static int actual;
    private static int[][] isConnected;

    @BeforeEach
    public void setup() {
        solution1 = new _547.Solution1();
        solution2 = new _547.Solution2();
    }

    @Test
    public void test1() {
        isConnected =
                new int[][]{
                        {1, 1, 0},
                        {1, 1, 0},
                        {0, 0, 1},
                };
        expected = 2;
        actual = solution1.findCircleNum(isConnected);
        actual = solution2.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        isConnected =
                new int[][]{
                        {1, 1, 0},
                        {1, 1, 1},
                        {0, 1, 1},
                };
        expected = 1;
        actual = solution1.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        isConnected =
                new int[][]{
                        {1, 0, 0, 1},
                        {0, 1, 1, 0},
                        {0, 1, 1, 1},
                        {1, 0, 1, 1},
                };
        expected = 1;
        actual = solution1.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        isConnected =
                new int[][]{
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1},
                };
        expected = 3;
        actual = solution1.findCircleNum(isConnected);
        assertEquals(expected, actual);
    }
}
