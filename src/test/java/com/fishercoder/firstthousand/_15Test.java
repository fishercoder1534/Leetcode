package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._15;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _15Test {
    private _15.Solution1 solution1;
    private static int[] nums;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
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

    @Test
    public void test2() {
        nums = new int[]{1, 2, -2, -1};
        expected = new ArrayList<>();
        assertEquals(expected, solution1.threeSum(nums));
    }

}