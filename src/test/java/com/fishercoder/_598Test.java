package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._598;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _598Test {
    private static _598.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _598.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxCount(3, 3, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,2],[3,3]")));
    }

}