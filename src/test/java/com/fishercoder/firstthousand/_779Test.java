package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._779;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _779Test {
    private _779.Solution1 solution1;
    private _779.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _779.Solution1();
        solution2 = new _779.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.kthGrammar(1, 1));
        assertEquals(0, solution2.kthGrammar(1, 1));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.kthGrammar(2, 1));
        assertEquals(0, solution2.kthGrammar(2, 1));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.kthGrammar(2, 2));
        assertEquals(1, solution2.kthGrammar(2, 2));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.kthGrammar(4, 5));
        assertEquals(1, solution2.kthGrammar(4, 5));
    }
}
