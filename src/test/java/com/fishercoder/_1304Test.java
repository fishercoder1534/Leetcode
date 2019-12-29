package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1304;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1304Test {
    private static _1304.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1304.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.sumZero(5));
    }

}