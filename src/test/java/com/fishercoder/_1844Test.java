package com.fishercoder;

import com.fishercoder.solutions._1844;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class _1844Test {
    private static _1844.Solution2 solution2;
    private static String s;
    private static String actual;

    @BeforeClass
    public static void setup() {
        solution2 = new _1844.Solution2();
    }

    @Test
    public void test1() {
        s = "a1c1e1";
        actual = "abcdef";
        String expected = solution2.replaceDigits(s);
        Assert.assertEquals(actual, expected);
    }
}