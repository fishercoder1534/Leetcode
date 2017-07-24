package com.fishercoder;

import com.fishercoder.solutions._523;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _523Test {
    private static _523 test;
    private static boolean expected;
    private static boolean actual;
    private static int[] nums;
    private static int k;

    @BeforeClass
    public static void setup(){
        test = new _523();
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

    @Test
    public void test6(){
        nums = new int[]{1,1};
        expected = true;
        k = 2;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        nums = new int[]{0};
        expected = false;
        k = -1;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test8(){
        nums = new int[]{23,2,4,6,7};
        expected = true;
        k = -6;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test9(){
        nums = new int[]{1,2,3};
        expected = false;
        k = 4;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test10(){
        nums = new int[]{5,2,4};
        expected = false;
        k = 5;
        actual = test.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

}
