package com.fishercoder;

import com.fishercoder.solutions._20;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _20Test {
    private static _20.Solution1 solution1;

    @BeforeClass
    public static void setup() {
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