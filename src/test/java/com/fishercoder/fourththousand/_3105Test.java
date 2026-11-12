package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3105;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3105Test {
    private _3105.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3105.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.longestMonotonicSubarray(new int[]{2, 1, 2, 4}));
    }
}
