package com.fishercoder;

import com.fishercoder.solutions._163;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 12/31/16.
 */
public class _163Test {

    private static _163 test;
    private static List<String> expected;
    private static List<String> actual;
    private static int lower;
    private static int upper;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        test = new _163();
        expected = new ArrayList();
        actual = new ArrayList();
    }

    @Before
    public void setupForEachTest() {
        expected.clear();
        actual.clear();
    }

    @Test
    public void test1() {

        //test case 1: should return ["0->2147483646"]
        lower = 0;
        upper = 2147483647;
        nums = new int[]{2147483647};
        expected.add("0->2147483646");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        //test case 2: should return ["-2147483647->-1","1->2147483646"]
        lower = -2147483648;
        upper = 2147483647;
        nums = new int[]{-2147483648, -2147483648, 0, 2147483647, 2147483647};
        expected.add("-2147483647->-1");
        expected.add("1->2147483646");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        //test case 3: should return ["-2147483648->2147483647"]
        lower = -2147483648;
        upper = 2147483647;
        nums = new int[]{};
        expected.add("-2147483648->2147483647");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        //test case 4: should return ["-2147483648->2147483646"]
        lower = -2147483648;
        upper = 2147483647;
        nums = new int[]{2147483647};
        expected.add("-2147483648->2147483646");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        //test case 5: should return ["0->2147483647"]
        lower = 0;
        upper = 2147483647;
        nums = new int[]{};
        expected.add("0->2147483647");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        //test case 6: should return ["-2147483647->2147483647"]
        lower = -2147483648;
        upper = 2147483647;
        nums = new int[]{-2147483648};
        expected.add("-2147483647->2147483647");
        actual = test.findMissingRanges(nums, lower, upper);
        assertEquals(expected, actual);
    }
}
