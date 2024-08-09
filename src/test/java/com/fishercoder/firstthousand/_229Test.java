package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._229;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _229Test {
    private _229.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _229.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1};
        assertEquals(Arrays.asList(1), solution1.majorityElement(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{1, 2};
        assertEquals(Arrays.asList(2, 1), solution1.majorityElement(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{2, 2};
        assertEquals(Arrays.asList(2), solution1.majorityElement(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{1, 2, 3};
        assertEquals(Arrays.asList(), solution1.majorityElement(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{3, 2, 3};
        assertEquals(Arrays.asList(3), solution1.majorityElement(nums));
    }

    @Test
    public void test6() {
        nums = new int[]{3, 3, 4};
        assertEquals(Arrays.asList(3), solution1.majorityElement(nums));
    }

    @Test
    public void test7() {
        nums = new int[]{2, 2, 1, 3};
        assertEquals(Arrays.asList(2), solution1.majorityElement(nums));
    }

    @Test
    public void test8() {
        nums = new int[]{2, 2, 3, 3, 2, 4};
        assertEquals(Arrays.asList(2), solution1.majorityElement(nums));
    }

}