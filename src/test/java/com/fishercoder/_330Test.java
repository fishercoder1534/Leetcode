package com.fishercoder;

import com.fishercoder.solutions._330;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/12/17.
 */
public class _330Test {
    private static _330 test;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _330();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 4, 13, 43};
        List<Integer> expected = new ArrayList(Arrays.asList(8, 29));
        assertEquals(expected, test.findPatches(nums, 100));
        assertEquals(2, test.minPatches(nums, 100));
    }
}
