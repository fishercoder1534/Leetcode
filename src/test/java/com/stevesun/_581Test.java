package com.stevesun;

import com.stevesun.solutions._48;
import com.stevesun.solutions._581;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/17/17.
 */
public class _581Test {
    private static _581 test;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _581();
    }

    @Test
    public void test1(){
        nums = new int[]{1,2,3,4};
        assertEquals(0, test.findUnsortedSubarray(nums));
        assertEquals(0, test.findUnsortedSubarray_sorting(nums));
    }

    @Test
    public void test2(){
        nums = new int[]{2,6,4,8,10,9,15};
        assertEquals(5, test.findUnsortedSubarray(nums));
    }
}
