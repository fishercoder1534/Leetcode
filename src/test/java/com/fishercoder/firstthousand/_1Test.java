package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1Test {
    private _1.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 7, 11, 15};
        assertArrayEquals(new int[] {0, 1}, solution1.twoSum(nums, 9));
    }
}
