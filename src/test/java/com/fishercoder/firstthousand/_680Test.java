package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._680;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _680Test {
    private _680.Solution1 solution1;
    private _680.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _680.Solution1();
        solution2 = new _680.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.validPalindrome("aba"));
        assertEquals(true, solution2.validPalindrome("aba"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.validPalindrome("abcca"));
        assertEquals(true, solution2.validPalindrome("abcca"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.validPalindrome("acbca"));
        assertEquals(true, solution2.validPalindrome("acbca"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.validPalindrome("accbba"));
        assertEquals(false, solution2.validPalindrome("accbba"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.validPalindrome("abdeeda"));
        assertEquals(true, solution2.validPalindrome("abdeeda"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.validPalindrome("cbbcc"));
        assertEquals(true, solution2.validPalindrome("cbbcc"));
    }

    @Test
    public void test7() {
        assertEquals(false, solution1.validPalindrome("abc"));
        assertEquals(false, solution2.validPalindrome("abc"));
    }
}