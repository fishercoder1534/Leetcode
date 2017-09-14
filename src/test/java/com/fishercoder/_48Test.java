package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._48;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by fishercoder on 5/8/17.
 */
public class _48Test {
    private static _48.Solution1 solution1;
    private static _48.Solution2 solution2;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _48.Solution1();
        solution2 = new _48.Solution2();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        solution1.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        solution2.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }
}
