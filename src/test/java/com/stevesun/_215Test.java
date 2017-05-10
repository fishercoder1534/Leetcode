package com.stevesun;

import com.stevesun.solutions._215;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/9/17.
 */
public class _215Test {
    private static _215 test;
    private static int k;
    private static int[] nums;
    private static int actual;
    private static int expected;

    @BeforeClass
    public static void setup(){
        test = new _215();
    }

    @Test
    public void test1(){
        k = 2;
        nums = new int[]{3,2,1,5,6,4};
        actual = test.findKthLargest(nums, k);
        expected = 5;
        assertEquals(expected, actual);
    }
}
