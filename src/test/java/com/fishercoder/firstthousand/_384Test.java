package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._384;
import org.junit.jupiter.api.Test;

public class _384Test {
    private _384.Solution2 solution2;

    @Test
    public void test1() {
        solution2 = new _384.Solution2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        CommonUtils.printArray(solution2.shuffle());
    }
}
