package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._685;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _685Test {
    private _685.Solution1 solution1;
    private _685.Solution2 solution2;
    private static int[][] edges;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _685.Solution1();
        solution2 = new _685.Solution2();
    }

    @Test
    public void test1() {
        edges = new int[][]{
                {2, 1},
                {3, 1},
                {4, 2},
                {1, 4}
        };
        expected = new int[]{2, 1};
        assertArrayEquals(expected, solution1.findRedundantDirectedConnection(edges));
        assertArrayEquals(expected, solution2.findRedundantDirectedConnection(edges));
    }

    @Test
    public void test2() {
        edges = new int[][]{
                {2, 1},
                {1, 4},
                {4, 3},
                {3, 2}
        };
        expected = new int[]{3, 2};
        assertArrayEquals(expected, solution1.findRedundantDirectedConnection(edges));
        assertArrayEquals(expected, solution2.findRedundantDirectedConnection(edges));
    }

    @Test
    public void test3() {
        edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3},
        };
        expected = new int[]{2, 3};
//        assertArrayEquals(expected, solution1.findRedundantDirectedConnection(edges));
        assertArrayEquals(expected, solution2.findRedundantDirectedConnection(edges));
    }
}