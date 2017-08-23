package com.fishercoder;

import com.fishercoder.solutions._264;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/7/17.
 */
public class _264Test {
    private static _264 test;

    @BeforeClass
    public static void setup() {
        test = new _264();
    }

    @Test
    public void test1() {
        assertEquals(12, test.nthUglyNumber(10));
    }

    @Test
    public void test2() {
        assertEquals(402653184, test.nthUglyNumber(1352));
    }
}
