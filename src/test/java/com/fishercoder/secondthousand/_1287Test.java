package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1287;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1287Test {
    private _1287.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1287.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.findSpecialInteger(new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.findSpecialInteger(new int[] {1}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.findSpecialInteger(new int[] {1, 2, 3, 3}));
    }
}
