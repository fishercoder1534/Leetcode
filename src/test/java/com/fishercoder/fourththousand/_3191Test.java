package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3191;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3191Test {
    private static _3191.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3191.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minOperations(new int[]{0, 1, 1, 1, 0, 0}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minOperations(new int[]{0, 1, 1, 1}));
    }

}