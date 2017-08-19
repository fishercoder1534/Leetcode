package com.fishercoder;

import com.fishercoder.solutions._151;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _151Test {
    private static _151 test;
    private static String s;

    @BeforeClass
    public static void setup() {
        test = new _151();
    }

    @Test
    public void test1() {
        s = " ";
        assertEquals("", test.reverseWords(s));
    }

    @Test
    public void test2() {
        s = " 1";
        assertEquals("1", test.reverseWords(s));
    }

    @Test
    public void test3() {
        s = "   a   b ";
        assertEquals("b a", test.reverseWords(s));
    }

}
