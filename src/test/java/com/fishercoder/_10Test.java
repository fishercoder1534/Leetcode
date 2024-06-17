package com.fishercoder;

import com.fishercoder.solutions.first_thousand._10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _10Test {
    private static _10.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _10.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isMatch("", ""));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isMatch("aa", "a"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isMatch("aab", "c*a*b"));
    }

}