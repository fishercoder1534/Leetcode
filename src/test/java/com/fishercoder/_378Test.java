package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._378;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _378Test {
    private static _378.Solution1 solution1;
    private static _378.Solution2 solution2;
    private static _378.Solution3 solution3;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _378.Solution1();
        solution2 = new _378.Solution2();
        solution3 = new _378.Solution3();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                new int[]{-5}
        };
        assertEquals(-5, solution1.kthSmallest(matrix, 1));
        assertEquals(-5, solution2.kthSmallest(matrix, 1));
        assertEquals(-5, solution3.kthSmallest(matrix, 1));
    }

    @Test
    public void test2() {
        matrix = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[1,3]");
        assertEquals(1, solution1.kthSmallest(matrix, 2));
        assertEquals(1, solution2.kthSmallest(matrix, 2));
        assertEquals(1, solution3.kthSmallest(matrix, 2));
    }

    @Test
    public void test3() {
        matrix = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,5,9],[10,11,13],[12,13,15]");
        assertEquals(13, solution1.kthSmallest(matrix, 8));
        assertEquals(13, solution2.kthSmallest(matrix, 8));
        assertEquals(13, solution3.kthSmallest(matrix, 8));
    }

}