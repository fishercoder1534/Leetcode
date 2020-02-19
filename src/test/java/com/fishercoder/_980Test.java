package com.fishercoder;

import com.fishercoder.solutions._980;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class _980Test {
    private static _980.Solution1 solution1;
    private static int[][] grid;

    @BeforeClass
    public static void setup() {
        solution1 = new _980.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1},
        };
        assertEquals(2, solution1.uniquePathsIII(grid));
    }

}