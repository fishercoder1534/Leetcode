package com.fishercoder;

import com.fishercoder.solutions._43;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/28/17.
 */
public class _43Test {
    private static _43 test;

    @BeforeClass
    public static void setup() {
        test = new _43();
    }

    @Test
    public void test1() {
        assertEquals("5535", test.multiply("123", "45"));
    }

    @Test
    public void test2() {
        assertEquals("0", test.multiply("9133", "0"));
    }

    @Test
    public void test3() {
        assertEquals("491555843274052692", test.multiply("6913259244", "71103343"));
    }

    @Test
    public void test4() {
        assertEquals("67143675422804947379429215144664313370120390398055713625298709447", test.multiply("401716832807512840963", "167141802233061013023557397451289113296441069"));
    }
}
