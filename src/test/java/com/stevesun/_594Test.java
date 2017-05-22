package com.stevesun;

import com.stevesun.solutions._48;
import com.stevesun.solutions._594;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/20/17.
 */
public class _594Test {
    private static _594 test;
    private static int[] nums;

    @BeforeClass
    public static void setup(){
        test = new _594();
    }

    @Test
    public void test1(){
        nums = new int[]{1,3,2,2,5,2,3,7};
        assertEquals(5, test.findLHS(nums));
    }
}
