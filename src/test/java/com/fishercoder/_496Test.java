package com.fishercoder;

import com.fishercoder.solutions._496;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _496Test {
    private static _496 test;
    private static int[] findNums;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeClass
    public static void setup(){
        test = new _496();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
        findNums = new int[]{};
        nums = new int[]{};
    }

    @Test
    public void test1(){
        findNums = new int[]{4,1,2};
        nums = new int[]{1,3,4,2};
        expected = new int[]{-1, 3, -1};
        actual = test.nextGreaterElement_naive_way(findNums, nums);
        assertArrayEquals(expected, actual);

        actual = test.nextGreaterElement_clever_way(findNums, nums);
        assertArrayEquals(expected, actual);
    }
}
