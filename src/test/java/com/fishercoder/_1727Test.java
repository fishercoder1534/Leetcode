package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1;
import com.fishercoder.solutions._1727;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class _1727Test {
    private static _1727.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1727.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.largestSubmatrix(
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,1,1,1,1,1],[1,1,0,1,1,0,1],[1,0,0,1,0,1,1]")));
    }

}