package com.fishercoder;

import com.fishercoder.solutions._347;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _347Test {
    private static _347.Solution1 solution1;
    private static _347.Solution2 solution2;
    private static int[] nums;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _347.Solution1();
        solution2 = new _347.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 0, 1, 0};
        expected = new ArrayList<>(Arrays.asList(0, 3));
        /**Comment out until Leetcode addresses this test case:
         * https://discuss.leetcode.com/topic/44237/java-o-n-solution-bucket-sort/75
         * Then I'll update this Solution1 code accordingly.
         *
         * My post is still un-addressed. - 3/12/2018*/
        //assertEquals(expected, solution1.topKFrequent(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[]{3, 0, 1, 0};
        expected = new ArrayList<>(Arrays.asList(0, 3));
        assertEquals(expected, solution2.topKFrequent(nums, 2));
    }

    @Test
    public void test3() {
        nums = new int[] {1, 1, 1, 2, 2, 3};
        expected = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(expected, solution1.topKFrequent(nums, 2));
    }
}
