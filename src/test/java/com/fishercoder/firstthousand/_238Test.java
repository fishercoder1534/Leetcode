package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._238;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _238Test {
    private _238.Solution1 solution1;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;

    @BeforeEach
    public void setup() {
        solution1 = new _238.Solution1();
        expected = new int[]{};
        actual = new int[]{};
    }

    @Test
    public void test1() {
        nums = new int[]{0, 0};
        expected = new int[]{0, 0};
        actual = solution1.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        nums = new int[]{1, 0};
        expected = new int[]{0, 1};
        actual = solution1.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        nums = new int[]{1, 2, 3, 4};
        expected = new int[]{24, 12, 8, 6};
        actual = solution1.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}
