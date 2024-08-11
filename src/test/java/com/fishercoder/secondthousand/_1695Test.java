package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1695;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1695Test {
    private _1695.Solution1 solution1;
    private _1695.Solution2 solution2;
    private static int[] nums;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1695.Solution1();
        solution2 = new _1695.Solution2();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 2, 4, 5, 6};
        expected = 17;
        assertEquals(expected, solution1.maximumUniqueSubarray(nums));
        assertEquals(expected, solution2.maximumUniqueSubarray(nums));
    }

}