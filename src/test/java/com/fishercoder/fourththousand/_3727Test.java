package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3727;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3727Test {
    private _3727.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3727.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(16, solution1.maxAlternatingSum(new int[]{1, -1, 2, -2, 3, -3}));
    }
}
