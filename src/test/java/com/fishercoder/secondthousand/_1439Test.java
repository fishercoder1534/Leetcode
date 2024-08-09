package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1439;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1439Test {
    private _1439.Solution1 solution1;
    private static int[][] mat;
    private static int expected;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _1439.Solution1();
    }

    @Test
    public void test1() {
        mat = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3,11],[2,4,6]");
        expected = 7;
        k = 5;
        assertEquals(expected, solution1.kthSmallest(mat, k));
    }

    @Test
    public void test2() {
        mat = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3,11],[2,4,6]");
        expected = 17;
        k = 9;
        assertEquals(expected, solution1.kthSmallest(mat, k));
    }

    @Test
    public void test3() {
        mat = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,10,10],[1,4,5],[2,3,6]");
        expected = 9;
        k = 7;
        assertEquals(expected, solution1.kthSmallest(mat, k));
    }

    @Test
    public void test4() {
        mat = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,10],[2,2,9]");
        expected = 12;
        k = 7;
        assertEquals(expected, solution1.kthSmallest(mat, k));
    }

}