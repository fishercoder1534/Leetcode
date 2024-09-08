package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._421;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _421Test {
    private _421.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _421.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {3, 10, 5, 25, 2, 8};
        expected = 28;
        actual = solution1.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }
}
