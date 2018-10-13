package com.fishercoder;

import com.fishercoder.solutions._239;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class _239Test {
    private static _239.Solution1 solution1;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _239.Solution1();
    }

    @Before
    public void setupForEachTest() {
        expected = new int[]{};
        actual = new int[]{};
        nums = new int[]{};
        k = 0;
    }

    @Test
    public void test1() {

        nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        k = 3;
        expected = new int[]{3, 3, 5, 5, 6, 7};
        actual = solution1.maxSlidingWindow(nums, k);
        Assert.assertArrayEquals(expected, actual);

    }
}
