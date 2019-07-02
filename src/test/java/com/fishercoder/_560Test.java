package com.fishercoder;

import com.fishercoder.solutions._560;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 4/29/17.
 */
public class _560Test {
    private static _560.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _560.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 1};
        k = 2;
        expected = 2;
        actual = solution1.subarraySum(nums, k);
        assertEquals(expected, actual);
    }
}
