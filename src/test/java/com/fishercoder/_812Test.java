package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._812;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _812Test {
    private static _812.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _812.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.largestTriangleArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0],[0,1],[1,0],[0,2],[2,0]")), 0.0000001);
    }

    @Test
    public void test2() {
        assertEquals(1799.0, solution1.largestTriangleArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[-35,19],[40,19],[27,-20],[35,-3],[44,20],[22,-21],[35,33],[-19,42],[11,47],[11,37]")), 0.0000001);
    }

}
