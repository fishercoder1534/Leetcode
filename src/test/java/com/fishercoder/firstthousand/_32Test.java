package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._32;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _32Test {
    private _32.Solution1 solution1;
    private _32.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _32.Solution1();
        solution2 = new _32.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.longestValidParentheses("(()"));
        assertEquals(2, solution2.longestValidParentheses("(()"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.longestValidParentheses("()(()"));
        assertEquals(2, solution2.longestValidParentheses("()(()"));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.longestValidParentheses("(())("));
        assertEquals(4, solution2.longestValidParentheses("(())("));
    }

    @Test
    public void test4() {
        assertEquals(6, solution1.longestValidParentheses("()(())"));
        assertEquals(6, solution2.longestValidParentheses("()(())"));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.longestValidParentheses(")()())"));
        assertEquals(4, solution2.longestValidParentheses(")()())"));
    }

    @Test
    public void test6() {
        assertEquals(4, solution1.longestValidParentheses(")()())()()("));
        assertEquals(4, solution2.longestValidParentheses(")()())()()("));
    }

    @Test
    public void test7() {
        assertEquals(8, solution1.longestValidParentheses("((())())"));
        assertEquals(8, solution2.longestValidParentheses("((())())"));
    }

    @Test
    public void test8() {
        assertEquals(10, solution1.longestValidParentheses(")()(((())))("));
        assertEquals(10, solution2.longestValidParentheses(")()(((())))("));
    }

}
