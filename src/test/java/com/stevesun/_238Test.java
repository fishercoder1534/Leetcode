package com.stevesun;

import com.stevesun.solutions._238;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _238Test {
    private static _238 test;
    private static int[] expected;
    private static int[] actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _238();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
    }

    @Test
    public void test1(){
        nums = new int[]{0, 0};
        expected = new int[]{0, 0};
        actual = test.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1, 0};
        expected = new int[]{0, 1};
        actual = test.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1,2,3,4};
        expected = new int[]{24,12,8,6};
        actual = test.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}
