package com.fishercoder;

import com.fishercoder.solutions._493;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/10/17.
 */
public class _493Test {
    private static _493 test;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _493();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 3, 2, 3, 1};
        assertEquals(2, test.reversePairs(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{2, 4, 3, 5, 1};
        assertEquals(3, test.reversePairs(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        assertEquals(0, test.reversePairs(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        assertEquals(0, test.reversePairs(nums));
    }

    @Test
    public void test5() {
        nums = new int[]{2147483647, 2147483646, 2147483647, 2147483647, 2147483647};
        assertEquals(0, test.reversePairs(nums));
    }
}
