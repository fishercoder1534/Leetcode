package com.fishercoder;

import com.fishercoder.solutions._540;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _540Test {
    private static _540 test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _540();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        nums = new int[1000];
    }

    @Test
    public void test1(){
        nums = new int[]{1,1,2,3,3,4,4,8,8};
        expected = 2;
        actual = test.singleNonDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{3,3,7,7,10,11,11};
        expected = 10;
        actual = test.singleNonDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,1,2};
        expected = 2;
        actual = test.singleNonDuplicate(nums);
        assertEquals(expected, actual);
    }
}
