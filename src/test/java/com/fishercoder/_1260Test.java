package com.fishercoder;

import com.fishercoder.solutions._1260;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1260Test {
    private static _1260.Solution1 solution1;
    private static int[][] grid;
    private static List<List<Integer>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1260.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        expected = Arrays.asList(
                Arrays.asList(9, 1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6, 7, 8)
        );
        assertEquals(expected, solution1.shiftGrid(grid, 1));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {1},
                {2},
                {3},
                {4},
                {7},
                {6},
                {5}
        };
        expected = Arrays.asList(
                Arrays.asList(6),
                Arrays.asList(5),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(7)
        );
        assertEquals(expected, solution1.shiftGrid(grid, 23));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {3, 8, 1, 9},
                {19, 7, 2, 5},
                {4, 6, 11, 10},
                {12, 0, 21, 13}
        };
        expected = Arrays.asList(
                Arrays.asList(12, 0, 21, 13),
                Arrays.asList(3, 8, 1, 9),
                Arrays.asList(19, 7, 2, 5),
                Arrays.asList(4, 6, 11, 10)
        );
        assertEquals(expected, solution1.shiftGrid(grid, 4));
    }

}