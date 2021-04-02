package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._861;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _861Test {
    private static _861.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _861.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(39, solution1.matrixScore(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0,1,1],[1,0,1,0],[1,1,0,0]")));
    }

}