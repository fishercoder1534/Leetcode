package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._678;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _678Test {
    private _678.Solution1 solution1;
    private _678.Solution2 solution2;
    private _678.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _678.Solution1();
        solution2 = new _678.Solution2();
        solution3 = new _678.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkValidString("()"));
        assertEquals(true, solution2.checkValidString("()"));
        assertEquals(true, solution3.checkValidString("()"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.checkValidString("(*)"));
        assertEquals(true, solution2.checkValidString("(*)"));
        assertEquals(true, solution3.checkValidString("(*)"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.checkValidString("(*))"));
        assertEquals(true, solution2.checkValidString("(*))"));
        assertEquals(true, solution3.checkValidString("(*))"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.checkValidString("(((()))())))*))())()(**(((())(()(*()((((())))*())(())*(*(()(*)))()*())**((()(()))())(*(*))*))())"));
        assertEquals(false, solution2.checkValidString("(((()))())))*))())()(**(((())(()(*()((((())))*())(())*(*(()(*)))()*())**((()(()))())(*(*))*))())"));
        assertEquals(false, solution3.checkValidString("(((()))())))*))())()(**(((())(()(*()((((())))*())(())*(*(()(*)))()*())**((()(()))())(*(*))*))())"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.checkValidString("(((******)))"));
        assertEquals(true, solution2.checkValidString("(((******)))"));
        assertEquals(true, solution3.checkValidString("(((******)))"));
    }

}