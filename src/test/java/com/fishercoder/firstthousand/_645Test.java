package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._645;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _645Test {
    private _645.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _645.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 2, 4};
        assertArrayEquals(new int[]{2, 3}, solution1.findErrorNums(nums));
    }
}
