package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1003;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1003Test {
    private _1003.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
