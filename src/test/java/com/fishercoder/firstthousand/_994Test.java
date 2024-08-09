package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._994;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _994Test {
    private _994.Solution1 solution1;
    private _994.Solution2 solution2;
    private _994.Solution3 solution3;
    private static int[][] grid;

    @BeforeEach
    public void setUp() {
        solution1 = new _994.Solution1();
        solution2 = new _994.Solution2();
        solution3 = new _994.Solution3();
    }

    @Test
    public void test1() {
        grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, solution1.orangesRotting(grid));
    }

    @Test
    public void test2() {
        grid = new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        assertEquals(-1, solution1.orangesRotting(grid));
    }

    @Test
    public void test3() {
        grid = new int[][]{
                {0, 2}
        };
        assertEquals(0, solution1.orangesRotting(grid));
    }

    @Test
    public void test4() {
        grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, solution2.orangesRotting(grid));
    }

    @Test
    public void test5() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,0,0,1,0,1],[2,0,0,1,2,0]");
        assertEquals(-1, solution2.orangesRotting(grid));
    }

    @Test
    public void test6() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2],[1]");
        assertEquals(1, solution2.orangesRotting(grid));
        assertEquals(1, solution3.orangesRotting(grid));
    }

}
