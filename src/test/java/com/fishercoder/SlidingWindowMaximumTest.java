package com.fishercoder;

import com.fishercoder.solutions.SlidingWindowMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by fishercoder on 1/10/17.
 */
public class SlidingWindowMaximumTest {
    private static SlidingWindowMaximum test;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup(){
        test = new SlidingWindowMaximum();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[1000];
        actual = new int[1000];
        nums = new int[1000];
        k = 0;
    }

    @Test
    public void test1(){

        nums = new int[]{1,3,-1,-3,5,3,6,7};
        k = 3;
        expected = new int[]{3,3,5,5,6,7};
        actual = test.maxSlidingWindow(nums, k);
        Assert.assertArrayEquals(expected, actual);

    }
}
