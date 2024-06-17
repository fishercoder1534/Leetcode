package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._77;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _77Test {
    private static _77.Solution1 solution1;
    private static _77.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _77.Solution1();
        solution2 = new _77.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.combine(4, 2));
        CommonUtils.printListList(solution2.combine(4, 2));
    }
}
