package com.fishercoder;

import com.fishercoder.solutions._368;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _368Test {
    private static _368.Solution1 solution1;
    private static _368.Solution2 solution2;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _368.Solution1();
        solution2 = new _368.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 4, 8};
        assertEquals(Arrays.asList(1, 2, 4, 8), solution1.largestDivisibleSubset(nums));
        assertEquals(Arrays.asList(8, 4, 2, 1), solution2.largestDivisibleSubset(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2, 3};
        assertEquals(solution1.largestDivisibleSubset(nums), Arrays.asList(1, 2));
        assertEquals(solution2.largestDivisibleSubset(nums), Arrays.asList(2, 1));
    }

    @Test
    public void test3() {
        nums = new int[]{1};
        assertEquals(solution1.largestDivisibleSubset(nums), Arrays.asList(1));
    }

    @Test
    public void test4() {
        nums = new int[]{546, 669};
        assertEquals(solution1.largestDivisibleSubset(nums), Arrays.asList(546));
    }

    @Test
    public void test5() {
        nums = new int[]{};
        assertEquals(solution1.largestDivisibleSubset(nums), Arrays.asList());
    }

    @Test
    public void test6() {
        nums = new int[]{4, 8, 10, 240};
        assertEquals(solution1.largestDivisibleSubset(nums), Arrays.asList(4, 8, 240));
        assertEquals(solution2.largestDivisibleSubset(nums), Arrays.asList(240, 8, 4));
    }
}
