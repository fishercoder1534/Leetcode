package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1091;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1091Test {
    private static _1091.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1091.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.shortestPathBinaryMatrix(new int[][]{
                {0, 1},
                {1, 0}
        }));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.shortestPathBinaryMatrix(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0,0],[1,1,0],[1,1,0]")));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.shortestPathBinaryMatrix(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,0,0],[1,1,0],[1,1,0]")));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution1.shortestPathBinaryMatrix(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0,0],[1,1,0],[1,1,1]")));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.shortestPathBinaryMatrix(new int[][]{
                {0}
        }));
    }

    @Test
    public void test6() {
        assertEquals(7, solution1.shortestPathBinaryMatrix(new int[][]{
                {0, 1, 0, 0, 1, 1, 0}, {1, 0, 0, 0, 0, 0, 0}, {1, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 1}, {1, 0, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1, 0}
        }))
        ;
    }

}