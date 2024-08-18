package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._256;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _256Test {
    private _256.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _256.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.minCost(new int[][] {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}));
    }
}
