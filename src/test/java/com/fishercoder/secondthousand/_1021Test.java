package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1021;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1021Test {
    private _1021.Solution1 solution1;
    private _1021.Solution2 solution2;
    private _1021.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _1021.Solution1();
        solution2 = new _1021.Solution2();
        solution3 = new _1021.Solution3();
    }

    @Test
    public void test1() {
        assertEquals("()()()", solution1.removeOuterParentheses("(()())(())"));
        assertEquals("()()()", solution2.removeOuterParentheses("(()())(())"));
        assertEquals("()()()", solution3.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void test2() {
        assertEquals("()()()()(())", solution1.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void test3() {
        assertEquals("", solution1.removeOuterParentheses("()()"));
    }

    @Test
    public void test4() {
        assertEquals("()(())", solution2.removeOuterParentheses("(()(()))"));
    }
}
