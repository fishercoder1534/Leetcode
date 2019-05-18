package com.fishercoder;

import com.fishercoder.solutions._167;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _167Test {
    private static _167.Solution1 solution1;
    private static int[] numbers;
    private static int[] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _167.Solution1();
    }

    @Test
    public void test1() {
        numbers = new int[]{-3, 3, 4, 90};
        expected = new int[]{1, 2};
        assertArrayEquals(expected, solution1.twoSum(numbers, 0));
    }
}
