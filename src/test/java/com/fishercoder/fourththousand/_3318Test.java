package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3318;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3318Test {

    private _3318.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _3318.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 2, 3, 4, 2, 3};
        assertArrayEquals(new int[]{6, 10, 12}, solution1.findXSum(nums, 6, 2));
    }

    @Test
    public void test2() {
        nums = new int[]{3, 8, 7, 8, 7, 5};
        assertArrayEquals(new int[]{11, 15, 15, 15, 12}, solution1.findXSum(nums, 2, 2));
    }
}
