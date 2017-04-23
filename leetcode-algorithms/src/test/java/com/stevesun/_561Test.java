package com.stevesun;

import com.stevesun.solutions._561;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 4/23/17.
 */
public class _561Test {
    private static _561 test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _561();
    }

    @Test
    public void test1(){
        nums = new int[]{1,4,3,2};
        expected = 4;
        actual = test.arrayPairSum(nums);
        assertEquals(expected, actual);
    }

}
