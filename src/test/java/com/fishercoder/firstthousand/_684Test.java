package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._684;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _684Test {
    private _684.Solution1 solution1;
    private static int[][] edges;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _684.Solution1();
    }

    @Test
    public void test1() {
        edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}
        };
        expected = new int[]{2, 3};
        assertArrayEquals(expected, solution1.findRedundantConnection(edges));
    }

    @Test
    public void test2() {
        edges = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };
        expected = new int[]{1, 4};
        assertArrayEquals(expected, solution1.findRedundantConnection(edges));
    }

    @Test
    public void test3() {
        edges = new int[][]{
                {9, 10},
                {5, 8},
                {2, 6},
                {1, 5},
                {3, 8},
                {4, 9},
                {8, 10},
                {4, 10},
                {6, 8},
                {7, 9}
        };
        expected = new int[]{4, 10};
        assertArrayEquals(expected, solution1.findRedundantConnection(edges));
    }

    @Test
    public void test4() {
        edges = new int[][]{
                {1, 2},
                {2, 3},
                {1, 5},
                {3, 4},
                {1, 4}
        };
        expected = new int[]{1, 4};
        assertArrayEquals(expected, solution1.findRedundantConnection(edges));
    }

}