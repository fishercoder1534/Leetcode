package com.fishercoder;

import com.fishercoder.solutions.MaximumGap;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MaximumGapTest {
    private static MaximumGap test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new MaximumGap();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1(){
        nums = new int[]{};
        expected = 0;
        actual = test.maximumGap(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_1(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_2(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        nums = new int[]{1,3,6,5};
        expected = 2;
        actual = test.maximumGap(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_1(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_2(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        nums = new int[]{1, 100000};
        expected = 99999;
        actual = test.maximumGap(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_1(nums);
        assertEquals(expected, actual);

        actual = test.maximumGap_from_programcreek_2(nums);
        assertEquals(expected, actual);
    }
}
