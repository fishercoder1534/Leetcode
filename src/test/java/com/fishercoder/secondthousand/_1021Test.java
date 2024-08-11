package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1021;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1021Test {
    private _1021.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1021.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("()()()", solution1.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void test2() {
        assertEquals("()()()()(())", solution1.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void test3() {
        assertEquals("", solution1.removeOuterParentheses("()()"));
    }

}