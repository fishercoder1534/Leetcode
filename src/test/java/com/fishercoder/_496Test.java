package com.fishercoder;

import com.fishercoder.solutions._496;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _496Test {
    private static _496.Solution1 solution1;
    private static _496.Solution2 solution2;
    private static int[] findNums;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _496.Solution1();
        solution2 = new _496.Solution2();
    }

    @Before
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
