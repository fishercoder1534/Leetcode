package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1st_thousand._18;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _18Test {
    private static _18.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _18.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 0, -1, 0, -2, 2};
        CommonUtils.printListList(solution1.fourSum(nums, 0));
    }

}