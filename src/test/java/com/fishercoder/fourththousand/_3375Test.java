package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3375;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3375Test {
    private _3375.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3375.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minOperations(new int[] {5, 2, 5, 4, 5}, 2));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minOperations(new int[] {2, 1, 2}, 2));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.minOperations(new int[] {9, 7, 5, 3}, 1));
    }
}
