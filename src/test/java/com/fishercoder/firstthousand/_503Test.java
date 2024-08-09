package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._503;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _503Test {
    private _503.Solution1 solution1;
    private _503.Solution2 solution2;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeEach
    public void setup() {
        solution1 = new _503.Solution1();
        solution2 = new _503.Solution2();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = new int[]{};
        nums = new int[]{};
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 1};
        expected = new int[]{2, -1, 2};
        actual = solution1.nextGreaterElements(nums);
        assertArrayEquals(expected, actual);

        actual = solution2.nextGreaterElements(nums);
        assertArrayEquals(expected, actual);
    }
}
