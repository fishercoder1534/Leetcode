package com.fishercoder;

import com.fishercoder.solutions._680;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _680Test {
    private static _680.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _680.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.validPalindrome("aba"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.validPalindrome("abcca"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.validPalindrome("acbca"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.validPalindrome("accbba"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.validPalindrome("abdeeda"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.validPalindrome("cbbcc"));
    }

    @Test
    public void test7() {
        assertEquals(false, solution1.validPalindrome("abc"));
    }
}