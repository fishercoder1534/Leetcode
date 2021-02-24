package com.fishercoder;

import com.fishercoder.solutions._856;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _856Test {
    private static _856.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _856.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.scoreOfParentheses("()"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.scoreOfParentheses("(())"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.scoreOfParentheses("()()"));
    }

    @Test
    public void test4() {
        assertEquals(6, solution1.scoreOfParentheses("(()(()))"));
    }

    @Test
    public void test5() {
        assertEquals(16, solution1.scoreOfParentheses("((((()))))"));
    }

    @Test
    public void test6() {
        assertEquals(8, solution1.scoreOfParentheses("(((())))"));
    }

    @Test
    public void test7() {
        assertEquals(8, solution1.scoreOfParentheses("((())(()))"));
    }

    @Test
    public void test8() {
        assertEquals(8, solution1.scoreOfParentheses("(()()(()))"));
    }

    @Test
    public void test9() {
        assertEquals(12, solution1.scoreOfParentheses("(()()(()()))"));
    }

}