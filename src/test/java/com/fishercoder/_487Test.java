package com.fishercoder;

import com.fishercoder.solutions._487;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _487Test {
    private static _487 test;
    private static int[] nums;
    private static int expected;
    private static int actual;

    @BeforeClass
    public static void setup() {
        test = new _487();
    }

    @Before
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
        nums = new int[1000];
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 0, 1, 1, 1};
        expected = 3;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        nums = new int[]{1, 1, 1, 1, 1, 1};
        expected = 6;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }

    @Test
    public void test3() {
        nums = new int[]{};
        expected = 0;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }
}
