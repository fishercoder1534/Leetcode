package com.fishercoder;

import com.fishercoder.solutions._1003;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _1003Test {
    private static _1003.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1003.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isValid("aabcbc"));
    }

    @Test
    public void test2() {
        assertTrue(solution1.isValid("abcabcababcc"));
    }

    @Test
    public void test3() {
        assertFalse(solution1.isValid("abccba"));
    }

    @Test
    public void test4() {
        assertFalse(solution1.isValid("cababc"));
    }
}
