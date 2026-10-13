package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3456;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _3456Test {
    private _3456.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3456.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.hasSpecialSubstring("h", 1));
    }

    @Test
    public void test2() {
        assertTrue(solution1.hasSpecialSubstring("aaabaaa", 3));
    }

    @Test
    public void test3() {
        assertTrue(solution1.hasSpecialSubstring("bfggb", 2));
    }

    @Test
    public void test4() {
        assertTrue(solution1.hasSpecialSubstring("aaaabbaaa", 3));
    }

    @Test
    public void test5() {
        assertFalse(solution1.hasSpecialSubstring("ii", 1));
    }
}
