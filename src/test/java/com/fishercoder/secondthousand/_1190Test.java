package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1190;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1190Test {
    private static _1190.Solution1 solution1;
    private static _1190.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1190.Solution1();
        solution2 = new _1190.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("dcba", solution1.reverseParentheses("(abcd)"));
        assertEquals("dcba", solution2.reverseParentheses("(abcd)"));
    }

    @Test
    public void test2() {
        assertEquals("iloveu", solution1.reverseParentheses("(u(love)i)"));
    }

    @Test
    public void test3() {
        assertEquals("leetcode", solution1.reverseParentheses("(ed(et(oc))el)"));
    }

    @Test
    public void test4() {
        assertEquals("apmnolkjihgfedcbq", solution1.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }

}