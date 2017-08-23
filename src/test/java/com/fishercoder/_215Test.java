package com.fishercoder;

import com.fishercoder.solutions._215;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/9/17.
 */
public class _215Test {
    private static _215.Solution2 solution2;
    private static int k;
    private static int[] nums;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution2 = new _215.Solution2();
    }

    @Test
    public void test1() {
        k = 2;
        nums = new int[]{3, 2, 1, 5, 6, 4};
        actual = solution2.findKthLargest(nums, k);
        expected = 5;
        assertEquals(expected, actual);
    }
}
