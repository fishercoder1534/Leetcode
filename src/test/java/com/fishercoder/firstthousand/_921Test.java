package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._921;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _921Test {
    private _921.Solution1 solution1;
    private _921.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _921.Solution1();
        solution2 = new _921.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minAddToMakeValid("())"));
        assertEquals(1, solution2.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.minAddToMakeValid("((("));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minAddToMakeValid("()"));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.minAddToMakeValid("()))(("));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.minAddToMakeValid(")()"));
    }
}
