package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._452;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _452Test {
    private static _452.Solution1 solution1;
    private static _452.Solution2 solution2;
    private static _452.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _452.Solution1();
        solution2 = new _452.Solution2();
        solution3 = new _452.Solution3();
    }

    @Test
    public void test1() {
        int[][] points = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
                ("[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]");
        assertEquals(2, solution1.findMinArrowShots(points));
        assertEquals(2, solution2.findMinArrowShots(points));
        assertEquals(2, solution3.findMinArrowShots(points));
    }

    @Test
    public void test2() {
        int[][] points = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
                ("[-2147483646,-2147483645],[2147483646,2147483647]");
        assertEquals(2, solution1.findMinArrowShots(points));
        assertEquals(2, solution2.findMinArrowShots(points));
        assertEquals(2, solution3.findMinArrowShots(points));
    }

    @Test
    public void test3() {
        int[][] points = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
                ("[0,6],[0,9],[7,8]");
        assertEquals(2, solution1.findMinArrowShots(points));
        assertEquals(2, solution2.findMinArrowShots(points));
        assertEquals(2, solution3.findMinArrowShots(points));
    }

    @Test
    public void test4() {
        int[][] points = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
                ("[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]");
        assertEquals(2, solution1.findMinArrowShots(points));
        assertEquals(2, solution2.findMinArrowShots(points));
        assertEquals(2, solution3.findMinArrowShots(points));
    }

}