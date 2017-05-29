package com.fishercoder;

import com.fishercoder.solutions.MaxConsecutiveOnes;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MaxConsecutiveOnesTest {
    private static MaxConsecutiveOnes test;
    private static int[] nums;
    private static int expected;
    private static int actual;

    @BeforeClass
    public static void setup(){
        test = new MaxConsecutiveOnes();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        nums = new int[1000];
    }

    @Test
    public void test1(){
        nums = new int[]{1,1,0,1,1,1};
        expected = 3;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }

    @Test
    public void test2(){
        nums = new int[]{1,1,1,1,1,1};
        expected = 6;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }

    @Test
    public void test3(){
        nums = new int[]{};
        expected = 0;
        actual = test.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);

    }
}
