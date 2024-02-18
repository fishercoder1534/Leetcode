package com.fishercoder;

import com.fishercoder.solutions._45;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _45Test {
    private static _45.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _45.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, solution1.jump(nums));
    }
}
