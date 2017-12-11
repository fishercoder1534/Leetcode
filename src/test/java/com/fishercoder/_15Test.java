package com.fishercoder;

import com.fishercoder.solutions._15;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _15Test {
    private static _15.Solution1 solution1;
    private static int[] nums;
    private static List<List<Integer>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _15.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{-1, 0, 1, 2, -1, -4};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, solution1.threeSum(nums));
    }

}