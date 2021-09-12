package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._2001;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2001Test {
    private static _2001.Solution1 solution1;
    private static _2001.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _2001.Solution1();
        solution2 = new _2001.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.interchangeableRectangles(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,8],[3,6],[10,20],[15,30]")));
        assertEquals(6, solution2.interchangeableRectangles(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,8],[3,6],[10,20],[15,30]")));
    }
}
