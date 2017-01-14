package com.stevesun;

import com.stevesun.solutions.NumberComplement;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/14/17.
 */
public class NumberComplementTest {
    private static NumberComplement test;
    private static int expected;
    private static int actual;
    private static int input;

    @BeforeClass
    public static void setup() {
        test = new NumberComplement();
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
