package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._542;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _542Test {
    private static _542.Solution1 solution1;
    private static _542.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _542.Solution1();
        solution2 = new _542.Solution2();
    }

    @Test
    public void test1() {
        int[][] matrix = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,0,1,1,1,1,1,1,1],[1,1,0,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,1,1,0],[1,1,1,1,1,1,0,0,1,0],[1,0,0,1,1,1,0,1,0,1],[0,0,1,0,0,1,1,0,0,1],[0,1,0,1,1,1,1,1,1,1],[1,0,0,1,1,0,0,0,0,0],[0,0,1,1,1,1,0,1,1,1],[1,1,0,0,1,0,1,0,1,1]");
        int[][] expected = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,1,0,1,2,2,2,3,3,2],[2,1,0,1,1,1,1,2,2,1],[3,2,1,1,0,0,0,1,1,0],[2,1,1,2,1,1,0,0,1,0],[1,0,0,1,1,1,0,1,0,1],[0,0,1,0,0,1,1,0,0,1],[0,1,0,1,1,1,1,1,1,1],[1,0,0,1,1,0,0,0,0,0],[0,0,1,1,2,1,0,1,1,1],[1,1,0,0,1,0,1,0,1,2]");
        assertEquals(expected, solution1.updateMatrix(matrix));
        assertEquals(expected, solution2.updateMatrix(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0,0],[0,1,0],[0,0,0]");
        int[][] expected = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0,0],[0,1,0],[0,0,0]");
        assertEquals(expected, solution1.updateMatrix(matrix));
        assertEquals(expected, solution2.updateMatrix(matrix));
    }

}