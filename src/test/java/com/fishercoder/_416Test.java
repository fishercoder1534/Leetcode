package com.fishercoder;

import com.fishercoder.solutions._416;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/5/17.
 */
public class _416Test {
    private static _416 test;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _416();
    }

    @Test
    public void test1(){
        nums = new int[]{1, 5, 11, 5};
        assertEquals(true, test.canPartition(nums));
    }

    @Test
    public void test2(){
        nums = new int[]{1, 2, 3, 5};
        assertEquals(false, test.canPartition(nums));
    }

    @Test
    public void test3(){
        nums = new int[]{1,2,3,4,5,6,7};
        assertEquals(true, test.canPartition(nums));
    }

}

