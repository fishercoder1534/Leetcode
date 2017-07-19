package com.fishercoder;

import com.fishercoder.solutions._479;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 7/19/17.
 */
public class _479Test {
    private static _479 test;

    @BeforeClass
    public static void setup(){
        test = new _479();
    }

    @Test
    public void test1(){
        assertEquals(123, test.largestPalindrome(3));
    }
}
