package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2441;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class _2441Test {
    private static _2441.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2441.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.findMaxK(new int[]{-1, 10, 6, 7, -7, 1}));
    }
}
