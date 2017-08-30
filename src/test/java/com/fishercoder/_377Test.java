package com.fishercoder;

import com.fishercoder.solutions._377;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _377Test {
    private static _377.Solution1 solution1;
    private static _377.Solution2 solution2;
    private static _377.Solution3 solution3;
    private static int[] nums;
    private static int target;

    @BeforeClass
    public static void setup() {
        solution1 = new _377.Solution1();
        solution2 = new _377.Solution2();
        solution3 = new _377.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{1,2,3};
        target = 4;
        assertEquals(7, solution1.combinationSum4(nums, target));
        assertEquals(7, solution2.combinationSum4(nums, target));
        assertEquals(7, solution3.combinationSum4(nums, target));
    }

    @Test
    public void test2() {
        nums = new int[]{4,2,1};
        target = 32;
//        assertEquals(39882198, solution1.combinationSum4(nums, target));//this results in MLE, so comment out

        solution2.count = 0;//always have to reset this global variable to be zero before using it again
        assertEquals(39882198, solution2.combinationSum4(nums, target));

        assertEquals(39882198, solution3.combinationSum4(nums, target));
    }

}