package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._461;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _461Test {
    private _461.Solution1 solution1;
    private _461.Solution2 solution2;
    private _461.Solution3 solution3;
    private static int x;
    private static int y;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _461.Solution1();
        solution2 = new _461.Solution2();
        solution3 = new _461.Solution3();
    }

    @Test
    public void test1() {
        x = 1;
        y = 4;
        expected = 2;
        assertEquals(expected, solution1.hammingDistance(x, y));
        assertEquals(expected, solution2.hammingDistance(x, y));
        assertEquals(expected, solution3.hammingDistance(x, y));
    }

    @Test
    public void test2() {
        x = 3;
        y = 1;
        expected = 1;
        assertEquals(expected, solution1.hammingDistance(x, y));
        assertEquals(expected, solution2.hammingDistance(x, y));
        assertEquals(expected, solution3.hammingDistance(x, y));
    }
}
