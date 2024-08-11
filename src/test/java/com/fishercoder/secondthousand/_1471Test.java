package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1471;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1471Test {
    private _1471.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1471.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 1}, solution1.getStrongest(nums, 2));
    }

}