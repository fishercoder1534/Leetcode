package com.fishercoder;

import com.fishercoder.solutions._544;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _544Test {
    private static _544 test;
    private static int n;
    private static String expected;
    private static String actual;

    @BeforeClass
    public static void setup() {
        test = new _544();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        n = 2;
        expected = "(1,2)";
        actual = test.findContestMatch(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        n = 4;
        expected = "((1,4),(2,3))";
        actual = test.findContestMatch(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        n = 8;
        expected = "(((1,8),(4,5)),((2,7),(3,6)))";
        actual = test.findContestMatch(n);
        assertEquals(expected, actual);
    }

}
