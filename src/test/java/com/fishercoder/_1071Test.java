package com.fishercoder;

import com.fishercoder.solutions._1071;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1071Test {
    private static _1071.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1071.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("ABC", solution1.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    public void test2() {
        assertEquals("AB", solution1.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    public void test3() {
        assertEquals("", solution1.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    public void test4() {
        assertEquals("", solution1.gcdOfStrings("ABCABCD", "ABC"));
    }

}