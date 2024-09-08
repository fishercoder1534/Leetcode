package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._542;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _542Test {
    private _542.Solution1 solution1;
    private _542.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _542.Solution1();
        solution2 = new _542.Solution2();
    }

    @Test
    public void test1() {
        int[][] matrix =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1,0,1,1,1,1,1,1,1],[1,1,0,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,1,1,0],[1,1,1,1,1,1,0,0,1,0],[1,0,0,1,1,1,0,1,0,1],[0,0,1,0,0,1,1,0,0,1],[0,1,0,1,1,1,1,1,1,1],[1,0,0,1,1,0,0,0,0,0],[0,0,1,1,1,1,0,1,1,1],[1,1,0,0,1,0,1,0,1,1]");
        int[][] expected =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,1,0,1,2,2,2,3,3,2],[2,1,0,1,1,1,1,2,2,1],[3,2,1,1,0,0,0,1,1,0],[2,1,1,2,1,1,0,0,1,0],[1,0,0,1,1,1,0,1,0,1],[0,0,1,0,0,1,1,0,0,1],[0,1,0,1,1,1,1,1,1,1],[1,0,0,1,1,0,0,0,0,0],[0,0,1,1,2,1,0,1,1,1],[1,1,0,0,1,0,1,0,1,2]");
        assertArrayEquals(expected, solution1.updateMatrix(matrix));
        assertArrayEquals(expected, solution2.updateMatrix(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,0,0],[0,1,0],[0,0,0]");
        int[][] expected =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,0,0],[0,1,0],[0,0,0]");
        assertArrayEquals(expected, solution1.updateMatrix(matrix));
        assertArrayEquals(expected, solution2.updateMatrix(matrix));
    }
}
