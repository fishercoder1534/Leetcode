package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3353;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3353Test {
    private _3353.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3353.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(new int[] {1, 4, 2}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minOperations(new int[] {10, 10, 10}));
    }
}
