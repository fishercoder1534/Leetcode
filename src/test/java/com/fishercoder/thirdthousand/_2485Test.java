package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2485;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class _2485Test {
    private static _2485.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2485.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.pivotInteger(1));
    }
}
