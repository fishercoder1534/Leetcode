package com.fishercoder;

import com.fishercoder.solutions._9;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _9Test {
    private static _9.Solution1 solution1;
    private static _9.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _9.Solution1();
        solution2 = new _9.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isPalindrome(2147483647));
        assertEquals(false, solution2.isPalindrome(2147483647));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isPalindrome(0));
        assertEquals(true, solution2.isPalindrome(0));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isPalindrome(1));
        assertEquals(true, solution2.isPalindrome(1));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isPalindrome(10));
        assertEquals(false, solution2.isPalindrome(10));
    }

}