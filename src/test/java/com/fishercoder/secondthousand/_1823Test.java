package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1823;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1823Test {
    private _1823.Solution1 solution1;
    private _1823.Solution2 solution2;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _1823.Solution1();
        solution2 = new _1823.Solution2();
    }

    @Test
    public void test1() {
        expected = 1;
        assertEquals(expected, solution1.findTheWinner(6, 5));
        assertEquals(expected, solution2.findTheWinner(6, 5));
    }
}
