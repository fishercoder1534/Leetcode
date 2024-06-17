package com.fishercoder;

import com.fishercoder.solutions.firstthousand._20;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _20Test {
    private static _20.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _20.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isValid("(]"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isValid("([)]"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isValid("()[]{}"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.isValid("()"));
    }

}