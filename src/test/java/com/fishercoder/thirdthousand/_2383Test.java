package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2383;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2383Test {
    private _2383.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2383.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.minNumberOfHours(5, 3, new int[]{1, 4, 3, 2}, new int[]{2, 6, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(51, solution1.minNumberOfHours(1, 1, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 50}));
    }

}