package com.fishercoder;

import com.fishercoder.solutions._503;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _503Test {
    private static _503 test;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeClass
    public static void setup(){
        test = new _503();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        nums = new int[]{};
    }

    @Test
    public void test1(){
        nums = new int[]{1,2,1};
        expected = new int[]{2, -1, 2};
        actual = test.nextGreaterElements(nums);
        assertArrayEquals(expected, actual);
    }
}
