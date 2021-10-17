package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._2039;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2039Test {
    private static _2039.Solution1 solution1;
    private static int[][] edges;
    private static int[] patience;

    @BeforeClass
    public static void setup() {
        solution1 = new _2039.Solution1();
    }

    @Test
    public void test1() {
        edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2]");
        patience = new int[]{0, 2, 1};
        assertEquals(8, solution1.networkBecomesIdle(edges, patience));
    }

    @Test
    public void test2() {
        edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[1,2]");
        patience = new int[]{0, 10, 10};
        assertEquals(3, solution1.networkBecomesIdle(edges, patience));
    }

    @Test
    public void test3() {
        edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("" +
                "[3,8],[4,13],[0,7],[0,4],[1,8],[14,1],[7,2],[13,10],[9,11],[12,14],[0,6],[2,12],[11,5],[6,9],[10,3]");
        patience = new int[]{0, 3, 2, 1, 5, 1, 5, 5, 3, 1, 2, 2, 2, 2, 1};
        assertEquals(20, solution1.networkBecomesIdle(edges, patience));
    }

    @Test
    public void test4() {
        edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2]");
        patience = new int[]{0, 2, 2};
        assertEquals(7, solution1.networkBecomesIdle(edges, patience));
    }

    @Test
    public void test5() {
        edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2]");
        patience = new int[]{0, 2, 3};
        assertEquals(8, solution1.networkBecomesIdle(edges, patience));
    }

}