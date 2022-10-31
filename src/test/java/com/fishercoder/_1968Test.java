package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1968;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1968Test {
    private static _1968.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1968.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.rearrangeArray(new int[]{1, 2, 3, 4, 5}));
    }

}