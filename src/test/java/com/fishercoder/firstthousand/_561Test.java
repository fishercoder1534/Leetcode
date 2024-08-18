package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._561;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 4/23/17. */
public class _561Test {
    private _561.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _561.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {1, 4, 3, 2};
        expected = 4;
        actual = solution1.arrayPairSum(nums);
        assertEquals(expected, actual);
    }
}
