package com.stevesun;

import com.stevesun.solutions._48;
import com.stevesun.solutions._553;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/25/17.
 */
public class _553Test {
    private static _553 test;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _553();
    }

    @Test
    public void test1(){
        nums = new int[]{1000,100,10,2};
        assertEquals("1000/(100/10/2)", test.optimalDivision(nums));
    }

    @Test
    public void test2(){
        nums = new int[]{1000,100,40,10,2};
        assertEquals("1000/(100/40/10/2)", test.optimalDivision(nums));
    }
}
