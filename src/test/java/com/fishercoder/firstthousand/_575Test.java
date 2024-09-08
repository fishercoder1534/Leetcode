package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._575;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _575Test {
    private _575.Solution1 solution1;
    private static int expected;
    private static int actual;
    private static int[] candyType;

    @BeforeEach
    public void setup() {
        solution1 = new _575.Solution1();
    }

    @Test
    public void test1() {
        candyType = new int[] {1, 1, 2, 3};
        expected = 2;
        actual = solution1.distributeCandies(candyType);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        candyType = new int[] {1, 1, 2, 2, 3, 3};
        expected = 3;
        actual = solution1.distributeCandies(candyType);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        candyType = new int[] {1000, 1, 1, 1};
        expected = 2;
        actual = solution1.distributeCandies(candyType);
        assertEquals(expected, actual);
    }
}
