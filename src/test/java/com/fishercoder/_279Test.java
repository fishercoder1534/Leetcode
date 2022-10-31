package com.fishercoder;

import com.fishercoder.solutions._279;
import com.fishercoder.solutions._340;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _279Test {
    private static _279.Solution1 solution1;
    private static _279.Solution2 solution2;
    private static _279.Solution3 solution3;

    @BeforeClass
    public static void setup() {
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
