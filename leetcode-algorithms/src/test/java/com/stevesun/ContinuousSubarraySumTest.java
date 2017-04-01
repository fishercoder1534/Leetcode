package com.stevesun;

import com.stevesun.solutions.ContinuousSubarraySum;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ContinuousSubarraySumTest {
    private static ContinuousSubarraySum test;
    private static boolean expected;
    private static boolean actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup(){
        test = new ContinuousSubarraySum();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        nums = new int[]{23,2,4,6,7};
        expected = true;
        k = 6;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{23,2,6,4,7};
        expected = true;
        k = 6;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{23,2,6,4,7};
        expected = false;
        k = 0;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{0,1,0};
        expected = false;
        k = 0;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        nums = new int[]{0,0};
        expected = true;
        k = 0;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

}
