package com.fishercoder;

import com.fishercoder.solutions._476;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by fishercoder on 1/14/17.
 */
public class _476Test {
    private static _476 test;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeClass
    public static void setup() {
        test = new _476();
    }

    @Before
    public void setupForEachTest() {
        expected = 0;
        actual = 0;
        input = 0;
    }

    @Test
    public void test1() {

        input = 5;
        expected = 2;
        actual = test.findComplement(input);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {

        input = 5;
        expected = 2;
        actual = test.findComplement_oneLiner(input);
        assertEquals(expected, actual);

    }
}
