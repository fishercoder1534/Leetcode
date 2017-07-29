package com.fishercoder;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MaxConsecutiveOnesIITest {
    private static MaxConsecutiveOnesII test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new MaxConsecutiveOnesII();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        nums = new int[]{1,0,1,1,0};
        expected = 4;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1};
        expected = 1;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{0};
        expected = 1;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{1,1};
        expected = 2;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }
}
