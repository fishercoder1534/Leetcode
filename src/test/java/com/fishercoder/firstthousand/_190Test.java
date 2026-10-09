package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._190;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _190Test {
    private _190.Solution1 solution1;
    private _190.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _190.Solution1();
        solution2 = new _190.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(536870912, solution1.reverseBits(4));
        assertEquals(536870912, solution2.reverseBits(4));
    }

    @Test
    public void test2() {
        assertEquals(964176192, solution1.reverseBits(43261596));
    }
}
