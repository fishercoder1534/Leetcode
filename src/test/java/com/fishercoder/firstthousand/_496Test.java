package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._496;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _496Test {
    private _496.Solution1 solution1;
    private _496.Solution2 solution2;
    private static int[] findNums;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeEach
    public void setup() {
        solution1 = new _496.Solution1();
        solution2 = new _496.Solution2();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = new int[]{};
        actual = new int[]{};
        findNums = new int[]{};
        nums = new int[]{};
    }

    @Test
    public void test1() {
        findNums = new int[]{4, 1, 2};
        nums = new int[]{1, 3, 4, 2};
        expected = new int[]{-1, 3, -1};
        actual = solution1.nextGreaterElement(findNums, nums);
        assertArrayEquals(expected, actual);
        actual = solution2.nextGreaterElement(findNums, nums);
        assertArrayEquals(expected, actual);
    }
}
