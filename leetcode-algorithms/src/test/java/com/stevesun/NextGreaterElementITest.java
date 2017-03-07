package com.stevesun;

import com.stevesun.solutions.NextGreaterElementI;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementITest {
    private static NextGreaterElementI test;
    private static int[] findNums;
    private static int[] nums;
    private static int[] expected;
    private static int[] actual;

    @BeforeClass
    public static void setup(){
        test = new NextGreaterElementI();
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
        actual = test.nextGreaterElement(findNums, nums);
        assertArrayEquals(expected, actual);
    }
}
