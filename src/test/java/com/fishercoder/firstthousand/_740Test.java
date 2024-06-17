package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._740;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _740Test {
    private static _740.Solution1 solution1;
    private static _740.Solution2 solution2;
    private static _740.Solution3 solution3;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _740.Solution1();
        solution2 = new _740.Solution2();
        solution3 = new _740.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{3, 4, 2};
        assertEquals(6, solution1.deleteAndEarn(nums));
        assertEquals(6, solution2.deleteAndEarn(nums));
        assertEquals(6, solution3.deleteAndEarn(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 2, 3, 3, 3, 4};
        assertEquals(9, solution1.deleteAndEarn(nums));
        assertEquals(9, solution2.deleteAndEarn(nums));
        assertEquals(9, solution3.deleteAndEarn(nums));
    }
}
