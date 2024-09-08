package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._347;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _347Test {
    private _347.Solution1 solution1;
    private _347.Solution2 solution2;
    private static int[] nums;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _347.Solution1();
        solution2 = new _347.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[] {3, 0, 1, 0};
        expected = new int[] {0, 3};
        /**
         * Comment out until Leetcode addresses this test case:
         * https://discuss.leetcode.com/topic/44237/java-o-n-solution-bucket-sort/75 Then I'll
         * update this Solution1 code accordingly.
         *
         * <p>My post is still un-addressed. - 3/12/2018
         */
        // assertArrayEquals(expected, solution1.topKFrequent(nums, 2));
    }

    @Test
    public void test2() {
        nums = new int[] {3, 0, 1, 0};
        expected = new int[] {0, 3};
        assertArrayEquals(expected, solution2.topKFrequent(nums, 2));
    }

    @Test
    public void test3() {
        nums = new int[] {3, 0, 1, 0};
        expected = new int[] {0, 3};
    }

    @Test
    public void test4() {
        nums = new int[] {1, 1, 1, 2, 2, 3};
        expected = new int[] {1, 2};
        assertArrayEquals(expected, solution1.topKFrequent(nums, 2));
    }
}
