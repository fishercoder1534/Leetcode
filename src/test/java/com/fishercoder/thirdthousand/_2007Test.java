package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2007;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2007Test {
    private _2007.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2007.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8}));
    }

}
