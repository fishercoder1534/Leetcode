package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1968;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1968Test {
    private _1968.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1968.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.rearrangeArray(new int[] {1, 2, 3, 4, 5}));
    }
}
