package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._209;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _209Test {
    private _209.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _209.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {2, 3, 1, 2, 4, 3};
        assertEquals(2, solution1.minSubArrayLen(7, nums));
    }
}
