package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1679;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1679Test {
    private _1679.Solution1 solution1;
    private static int[] nums;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _1679.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
        k = 3;
        assertEquals(4, solution1.maxOperations(nums, k));
    }
}
