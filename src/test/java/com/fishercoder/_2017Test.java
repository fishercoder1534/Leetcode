package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1;
import com.fishercoder.solutions._2017;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class _2017Test {
    private static _2017.Solution1 solution1;
    private static int[][] grid;

    @BeforeClass
    public static void setup() {
        solution1 = new _2017.Solution1();
    }

    @Test
    public void test1() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,5,4],[1,5,1]");
        assertEquals(4, solution1.gridGame(grid));
    }

    @Test
    public void test2() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,3,1],[8,5,2]");
        assertEquals(4, solution1.gridGame(grid));
    }

    @Test
    public void test3() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3,1,15],[1,3,3,1]");
        assertEquals(7, solution1.gridGame(grid));
    }

    @Test
    public void test4() {
        grid = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[20,3,20,17,2,12,15,17,4,15],[20,10,13,14,15,5,2,3,14,3]");
        assertEquals(63, solution1.gridGame(grid));
    }

}