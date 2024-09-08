package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._312;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _312Test {
    private _312.Solution1 solution1;
    private static int[] nums;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _312.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {3, 1, 5, 8};
        expected = 167;
        assertEquals(expected, solution1.maxCoins(nums));
    }

    @Test
    public void test2() {
        nums = new int[] {1, 5};
        expected = 10;
        assertEquals(expected, solution1.maxCoins(nums));
    }
}
