package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3571;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3571Test {
    private _3571.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3571.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("aaa", solution1.shortestSuperstring("aa", "aaa"));
    }

    @Test
    public void test2() {
        assertEquals("tfj", solution1.shortestSuperstring("t", "fj"));
    }

    @Test
    public void test3() {
        assertEquals("lkgy", solution1.shortestSuperstring("lk", "kgy"));
    }

    @Test
    public void test4() {
        assertEquals("baba", solution1.shortestSuperstring("aba", "bab"));
    }

}
