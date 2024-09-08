package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1197;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1197Test {
    private _1197.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1197.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minKnightMoves(2, 1));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.minKnightMoves(5, 5));
    }

    @Test
    public void test3() {
        assertEquals(56, solution1.minKnightMoves(2, 112));
    }
}
