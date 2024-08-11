package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3237;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3237Test {
    private _3237.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3237.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 3, 1}, solution1.simulationResult(new int[]{1, 2, 3}, new int[]{3, 3, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 1, 4, 2}, solution1.simulationResult(new int[]{1, 4, 2, 3}, new int[]{4, 1, 3}));
    }
}