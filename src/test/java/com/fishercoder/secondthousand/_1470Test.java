package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1470;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1470Test {
    private _1470.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _1470.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 5, 1, 3, 4, 7};
        assertArrayEquals(new int[] {2, 3, 5, 4, 1, 7}, solution1.shuffle(nums, 3));
    }
}
