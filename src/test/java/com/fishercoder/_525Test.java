package com.fishercoder;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _525Test {
    private static com.fishercoder.solutions._525 test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new com.fishercoder.solutions._525();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        nums = new int[]{0, 1};
        expected = 2;
        actual = test.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{0, 1, 0};
        expected = 2;
        actual = test.findMaxLength(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{0,0,1,0,0,0,1,1};
        expected = 6;
        actual = test.findMaxLength(nums);
        assertEquals(expected, actual);
    }

}
