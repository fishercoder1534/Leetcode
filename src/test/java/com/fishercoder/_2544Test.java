package com.fishercoder;

import com.fishercoder.solutions._2544;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2544Test {
    private static _2544.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2544.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.alternateDigitSum(521));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.alternateDigitSum(10));
    }

}