package com.fishercoder;

import com.fishercoder.solutions._551;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _551Test {
    private static _551.Solution1 test;
    private static boolean expected;
    private static boolean actual;
    private static String s;

    @BeforeClass
    public static void setup() {
        test = new _551.Solution1();
    }

    @Test
    public void test1() {
        s = "ALLAPPL";
        expected = false;
        actual = test.checkRecord(s);
        assertEquals(expected, actual);
    }
}
