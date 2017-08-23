package com.fishercoder;

import com.fishercoder.solutions._154;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/25/17.
 */
public class _154Test {
    private static _154 test;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _154();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 1, 1};
        assertEquals(1, test.findMin(nums));
    }
}
