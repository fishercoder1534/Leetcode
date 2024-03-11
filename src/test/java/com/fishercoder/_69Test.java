package com.fishercoder;

import com.fishercoder.solutions._69;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _69Test {
    private static _69.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _69.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.mySqrt(16));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.mySqrt(8));
    }
}
