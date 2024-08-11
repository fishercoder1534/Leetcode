package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3192;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3192Test {
    private _3192.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3192.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.minOperations(new int[]{0, 1, 1, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.minOperations(new int[]{1, 0, 0, 0}));
    }

}