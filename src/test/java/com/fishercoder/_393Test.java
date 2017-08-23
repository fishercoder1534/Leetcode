package com.fishercoder;

import com.fishercoder.solutions._393;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 5/3/17.
 */
public class _393Test {
    private static _393 test;
    private static boolean expected;
    private static boolean actual;
    private static int[] data;

    @BeforeClass
    public static void setup() {
        test = new _393();
    }

    @Test
    @Ignore
    public void test1() {
        data = new int[]{197, 130, 1};
        expected = true;
        actual = test.validUtf8(data);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        data = new int[]{5};
        expected = true;
        actual = test.validUtf8(data);
        assertEquals(expected, actual);
    }
}
