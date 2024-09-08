package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._69;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _69Test {
    private _69.Solution1 solution1;

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
