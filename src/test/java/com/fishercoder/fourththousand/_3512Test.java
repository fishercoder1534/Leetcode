package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3512;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3512Test {
    private _3512.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3512.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.minOperations(new int[]{3, 9, 7}, 5));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.minOperations(new int[]{3, 2}, 6));
    }
}
