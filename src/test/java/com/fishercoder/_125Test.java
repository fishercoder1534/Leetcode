package com.fishercoder;

import com.fishercoder.solutions.first_thousand._125;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _125Test {
    private static _125.Solution1 solution1;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _125.Solution1();
    }

    @Test
    public void test1() {
        s = "A man, a plan, a canal: Panama";
        assertEquals(true, solution1.isPalindrome(s));
    }

    @Test
    public void test2() {
        s = "race a car";
        assertEquals(false, solution1.isPalindrome(s));
    }

    @Test
    public void test3() {
        s = " ";
        assertEquals(true, solution1.isPalindrome(s));
    }

    @Test
    public void test4() {
        s = "0P";
        assertEquals(false, solution1.isPalindrome(s));
    }
}
