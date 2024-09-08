package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3196;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3196Test {
    private _3196.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3196.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.maximumTotalCost(new int[] {1, -2, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(-7, solution1.maximumTotalCost(new int[] {-14, -13, -20}));
    }
}
