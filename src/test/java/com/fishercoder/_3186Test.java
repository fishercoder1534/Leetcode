package com.fishercoder;

import com.fishercoder.solutions._3186;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3186Test {
    private static _3186.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3186.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.maximumTotalDamage(new int[]{1, 1, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(31, solution1.maximumTotalDamage(new int[]{5, 9, 2, 10, 2, 7, 10, 9, 3, 8}));
    }

    @Test
    public void test3() {
        assertEquals(10, solution1.maximumTotalDamage(new int[]{7, 1, 6, 3}));
    }

}