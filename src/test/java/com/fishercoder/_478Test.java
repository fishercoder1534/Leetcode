package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._478;
import org.junit.Test;

public class _478Test {
    private static _478.Solution1 solution1;

    @Test
    public void test1() {
        solution1 = new _478.Solution1(10.0, 5.0, -7.5);
        CommonUtils.printArray(solution1.randPoint());
    }

}
