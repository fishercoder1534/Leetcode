package com.fishercoder;

import com.fishercoder.solutions._473;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/30/17.
 */
public class _473Test {
    private static _473 test;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _473();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 2, 2, 2};
        assertEquals(true, test.makesquare(nums));
    }
}
