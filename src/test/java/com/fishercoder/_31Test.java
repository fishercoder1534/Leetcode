package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._31;
import org.junit.BeforeClass;
import org.junit.Test;

public class _31Test {
    private static _31.Solution1 solution1;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _31.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        solution1.nextPermutation(nums);
        CommonUtils.printArray(nums);
    }
}
