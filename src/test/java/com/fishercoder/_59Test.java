package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._59;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _59Test {
    private static _59.Solution1 solution1;
    private static _59.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _59.Solution1();
        solution2 = new _59.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(solution1.generateMatrix(6));
        CommonUtils.print2DIntArray(solution2.generateMatrix(6));
    }
}
