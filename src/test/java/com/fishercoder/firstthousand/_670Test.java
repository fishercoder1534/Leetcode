package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._670;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _670Test {
    private _670.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _670.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7236, solution1.maximumSwap(2736));
    }

    @Test
    public void test2() {
        assertEquals(9973, solution1.maximumSwap(9973));
    }

    @Test
    public void test3() {
        assertEquals(73236, solution1.maximumSwap(23736));
    }

    @Test
    public void test4() {
        assertEquals(98213, solution1.maximumSwap(91283));
    }
}
