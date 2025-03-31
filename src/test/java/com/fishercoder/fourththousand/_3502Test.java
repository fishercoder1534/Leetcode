package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3502;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3502Test {
    private _3502.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3502.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 3, 3, 1, 1, 1}, solution1.minCosts(new int[]{5, 3, 4, 1, 3, 2}));
    }

}
