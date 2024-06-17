package com.fishercoder;

import com.fishercoder.solutions.firstthousand._28;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _28Test {
    private static _28.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _28.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.strStr("a", ""));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.strStr("mississippi", "a"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.strStr("a", "a"));
    }
}
