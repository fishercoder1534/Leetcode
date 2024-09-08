package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1526;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1526Test {
    private _1526.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1526.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minNumberOperations(new int[] {1, 2, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.minNumberOperations(new int[] {3, 1, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(7, solution1.minNumberOperations(new int[] {3, 1, 5, 4, 2}));
    }
}
