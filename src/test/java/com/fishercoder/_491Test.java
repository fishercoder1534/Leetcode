package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._491;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by stevesun on 5/30/17.
 */
public class _491Test {
    private static _491 test;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _491();
    }

    @Test
    public void test1(){
        nums = new int[]{4,6,7,7};
        List<List<Integer>> actual = test.findSubsequences(nums);
        CommonUtils.printIntegerList(actual);
    }
}
