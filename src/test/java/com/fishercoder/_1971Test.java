package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1971;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1971Test {
    private static _1971.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1971.Solution1();
    }

    @Test
    public void test1() {
        int[][] edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2],[2,0]");
        assertEquals(true, solution1.validPath(3, edges, 0, 2));
    }

    @Test
    public void test2() {
        int[][] edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[3,5],[5,4],[4,3]");
        assertEquals(false, solution1.validPath(6, edges, 0, 5));
    }

    @Test
    public void test3() {
        int[][] edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]");
        assertEquals(true, solution1.validPath(10, edges, 5, 9));
    }

    @Test
    public void test4() {
        int[][] edges = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,7],[0,8],[6,1],[2,0],[0,4],[5,8],[4,7],[1,3],[3,5],[6,5]");
        assertEquals(true, solution1.validPath(10, edges, 7, 5));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.validPath(1, new int[][]{}, 0, 0));
    }

}
