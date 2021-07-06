package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._892;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _892Test {
    private static _892.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _892.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.surfaceArea(new int[][]{{2}}));
    }

    @Test
    public void test2() {
        assertEquals(34, solution1.surfaceArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[3,4]")));
    }

    @Test
    public void test3() {
        assertEquals(16, solution1.surfaceArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,0],[0,2]")));
    }

    @Test
    public void test4() {
        assertEquals(32, solution1.surfaceArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,1],[1,0,1],[1,1,1]")));
    }

    @Test
    public void test5() {
        assertEquals(46, solution1.surfaceArea(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,2,2],[2,1,2],[2,2,2]")));
    }

}
