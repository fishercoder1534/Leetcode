package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._519;
import org.junit.jupiter.api.Test;

public class _519Test {

    private _519.Solution solution1;

    @Test
    public void test1() {
        solution1 = new _519.Solution(3, 1);
        CommonUtils.printArray(solution1.flip());
        CommonUtils.printArray(solution1.flip());
        CommonUtils.printArray(solution1.flip());
        solution1.reset();
        CommonUtils.printArray(solution1.flip());
    }
}
