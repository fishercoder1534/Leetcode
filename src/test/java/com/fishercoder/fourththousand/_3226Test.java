package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3226;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3226Test {
    private static _3226.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3226.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minChanges(13, 4));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minChanges(44, 2));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.minChanges(2, 47));
    }
}