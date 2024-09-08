package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2392;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2392Test {
    private _2392.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2392.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(
                solution1.buildMatrix(
                        3, new int[][] {{1, 2}, {3, 2}}, new int[][] {{2, 1}, {3, 2}}));
    }
}
