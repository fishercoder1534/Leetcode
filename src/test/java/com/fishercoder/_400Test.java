package com.fishercoder;

import com.fishercoder.solutions._400;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 4/26/17.
 */
public class _400Test {
    private static _400 test;
    private static int expected;
    private static int actual;
    private static int n;

    @BeforeClass
    public static void setup() {
        test = new _400();
    }

    @Test
    public void test1() {
        n = 11;
        expected = 0;
        actual = test.findNthDigit(n);
        assertEquals(expected, actual);
    }
}
