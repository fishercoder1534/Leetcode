package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._2007;
import org.junit.BeforeClass;
import org.junit.Test;

public class _2007Test {
    private static _2007.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2007.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8}));
    }

}
