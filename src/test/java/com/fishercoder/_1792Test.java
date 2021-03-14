package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1792;
import com.fishercoder.solutions._3;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1792Test {
    private static _1792.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1792.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0.78333, solution1.maxAverageRatio(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[3,5],[2,2]"), 2), 0.00001);
    }

}