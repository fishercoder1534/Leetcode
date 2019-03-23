package com.fishercoder;

import com.fishercoder.solutions._9;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _9Test {
    private static _9.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _9.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPalindrome(2147483647));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isPalindrome(0));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isPalindrome(1));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isPalindrome(10));
    }

}