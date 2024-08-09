package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._733;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _733Test {
    private _733.Solution1 solution1;
    private static int[][] image;
    private static int[][] result;

    @BeforeEach
    public void setup() {
        solution1 = new _733.Solution1();
    }

    @Test
    public void test1() {
        image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        result = solution1.floodFill(image, 1, 1, 2);
        CommonUtils.print2DIntArray(result);
    }

    @Test
    public void test2() {
        image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        result = solution1.floodFill(image, 0, 0, 2);
        CommonUtils.print2DIntArray(result);
    }

}