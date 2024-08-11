package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._125;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _125Test {
    private _125.Solution1 solution1;
    private static String s;

    @BeforeEach
    public void setup() {
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
