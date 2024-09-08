package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._491;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _491Test {
    private _491.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setUp() {
        solution1 = new _491.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {4, 6, 7, 7};
        List<List<Integer>> actual = solution1.findSubsequences(nums);
        CommonUtils.printListList(actual);
    }
}
