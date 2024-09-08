package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._44;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _44Test {
    private _44.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _44.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isMatch("aa", "a"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isMatch("aa", "aa"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.isMatch("aaa", "aa"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.isMatch("aa", "*"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.isMatch("aa", "a*"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.isMatch("ab", "?*"));
    }

    @Test
    public void test7() {
        assertEquals(false, solution1.isMatch("aab", "c*a*b"));
    }
}
