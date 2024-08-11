package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1033;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1033Test {
    private _1033.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1033.Solution1();
    }

    @Test
    public void test1() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution1.numMovesStones(1, 2, 5));
    }

    @Test
    public void test2() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution1.numMovesStones(4, 3, 2));
    }

    @Test
    public void test3() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution1.numMovesStones(3, 5, 1));
    }
}