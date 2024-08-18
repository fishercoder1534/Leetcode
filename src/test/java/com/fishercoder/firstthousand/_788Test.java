package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._788;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _788Test {
    private _788.Solution1 solution1;
    private _788.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _788.Solution1();
        solution2 = new _788.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.rotatedDigits(10));
        assertEquals(4, solution2.rotatedDigits(10));
    }

    @Test
    public void test2() {
        assertEquals(247, solution1.rotatedDigits(857));
        assertEquals(247, solution2.rotatedDigits(857));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.rotatedDigits(15));
        assertEquals(6, solution2.rotatedDigits(15));
    }
}
