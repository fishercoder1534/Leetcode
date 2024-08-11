package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._473;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _473Test {
    private _473.Solution1 solution1;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _473.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 2, 2};
        assertEquals(true, solution1.makesquare(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{3, 3, 3, 3, 4};
        assertEquals(false, solution1.makesquare(nums));
    }
}
