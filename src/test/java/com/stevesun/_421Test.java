package com.stevesun;

import com.stevesun.solutions._421;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 4/28/17.
 */
public class _421Test {
    private static _421 test;
    private static int expected;
    private static int actual;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _421();
    }

    @Test
    public void test1(){
        nums = new int[]{3, 10, 5, 25, 2, 8};
        expected = 28;
        actual = test.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }
}
