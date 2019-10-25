package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._59;
import org.junit.BeforeClass;
import org.junit.Test;

public class _59Test {
    private static _59.Solution1 solution1;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _59.Solution1();
    }

    @Test
    public void test1() {
        matrix = solution1.generateMatrix(6);
        CommonUtils.print2DIntArray(matrix);
    }
}
