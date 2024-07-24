package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2460;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2460Test {
    private static _2460.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2460.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 4, 2, 0, 0, 0}, solution1.applyOperations(new int[]{1, 2, 2, 1, 1, 0}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 0}, solution1.applyOperations(new int[]{0, 1}));
    }

}