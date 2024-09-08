package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2739;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2739Test {
    private _2739.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2739.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(20, solution1.distanceTraveled(2, 1));
    }
}
