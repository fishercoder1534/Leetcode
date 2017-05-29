package com.fishercoder;

import com.fishercoder.solutions._153;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 1/10/17.
 */
public class _153Test {
    private static _153 test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _153();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        expected = 0;
        actual = test.findMin(nums);
        assertEquals(expected, actual);

    }

    @Test
    public void test2(){
        nums = new int[]{1};
        expected = 1;
        actual = test.findMin(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{2, 1};
        expected = 1;
        actual = test.findMin(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        nums = new int[]{2,3,4,5,1};
        expected = 1;
        actual = test.findMin(nums);
        assertEquals(expected, actual);
    }
}
