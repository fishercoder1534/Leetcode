package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3038;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3038Test {
    private _3038.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _3038.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 2, 3, 2, 4, 2, 3, 3, 1, 3};
        assertEquals(1, solution1.maxOperations(nums));
    }
}
