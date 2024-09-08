package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._279;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _279Test {
    private _279.Solution1 solution1;
    private _279.Solution2 solution2;
    private _279.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _279.Solution1();
        solution2 = new _279.Solution2();
        solution3 = new _279.Solution3();
    }

    @Test
    public void test1() {
        int n = 9;
        int expected = 1;
        assertEquals(expected, solution1.numSquares(n));
        assertEquals(expected, solution2.numSquares(n));
        assertEquals(expected, solution3.numSquares(n));
    }
}
