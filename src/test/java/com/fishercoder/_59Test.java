package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._59;
import org.junit.BeforeClass;
import org.junit.Test;

public class _59Test {
    private static _59.Solution1 solution1;
    private static _59.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _59.Solution1();
        solution2 = new _59.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(solution1.generateMatrix(6));
        CommonUtils.print2DIntArray(solution2.generateMatrix(6));
    }
}
