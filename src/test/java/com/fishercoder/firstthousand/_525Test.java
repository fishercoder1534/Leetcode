package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._525;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _525Test {
    private _525.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _525.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{0, 1};
        expected = 2;
        actual = solution1.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        nums = new int[]{0, 1, 0};
        expected = 2;
        actual = solution1.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        nums = new int[]{0, 0, 1, 0, 0, 0, 1, 1};
        expected = 6;
        actual = solution1.findMaxLength(nums);
        assertEquals(expected, actual);
    }

}
