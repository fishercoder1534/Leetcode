package com.fishercoder;

import com.fishercoder.solutions.firstthousand._224;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _224Test {
    private static _224.Solution1 solution1;
    private static _224.Solution2 solution2;
    private static _224.Solution3 solution3;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _224.Solution1();
        solution2 = new _224.Solution2();
        solution3 = new _224.Solution3();
    }

    @Test
    public void test1() {
        String s = "1 + 1";
        expected = 2;
        assertEquals(expected, solution1.calculate(s));
        assertEquals(expected, solution2.calculate(s));
    }

    @Test
    public void test2() {
        String s = " 2-1 + 2 ";
        expected = 3;
        assertEquals(expected, solution1.calculate(s));
        assertEquals(expected, solution2.calculate(s));
    }

    @Test
    public void test3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        expected = 23;
        assertEquals(expected, solution1.calculate(s));
        assertEquals(expected, solution2.calculate(s));
        //assertEquals(expected, solution3.calculate(s));//TODO: fix this
    }

    @Test
    public void test4() {
        String s = "1-(-2)";
        expected = 3;
        assertEquals(expected, solution1.calculate(s));
        assertEquals(expected, solution2.calculate(s));
    }

}
