package com.stevesun;

import com.stevesun.solutions.RelativeRanks;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by stevesun on 1/15/17.
 */
public class RelativeRanksTest {
    private static RelativeRanks test;
    private static String[] expected;
    private static String[] actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new RelativeRanks();
    }

    @Before
    public void setupForEachTest(){
        expected = new String[]{};
        actual = new String[]{};
    }

    @Test
    public void test1(){
        nums = new int[]{2,4,1};
        expected = new String[]{"Silver Medal","Gold Medal","Bronze Medal"};
        actual = test.findRelativeRanks(nums);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2(){
        nums = new int[]{5, 4, 3, 2, 1};
        expected = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        actual = test.findRelativeRanks(nums);
        assertArrayEquals(expected, actual);

    }
}
