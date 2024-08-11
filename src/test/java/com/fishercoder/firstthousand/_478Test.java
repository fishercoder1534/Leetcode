package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._478;
import org.junit.jupiter.api.Test;

public class _478Test {
    private _478.Solution1 solution1;

    @Test
    public void test1() {
        solution1 = new _478.Solution1(10.0, 5.0, -7.5);
        CommonUtils.printArray(solution1.randPoint());
    }

}
