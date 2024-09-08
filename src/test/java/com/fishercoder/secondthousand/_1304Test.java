package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1304;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1304Test {
    private _1304.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1304.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.sumZero(5));
    }
}
