package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1509;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1509Test {
    private _1509.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1509.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minDifference(new int[] {6, 6, 0, 1, 1, 4, 6}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.minDifference(new int[] {82, 81, 95, 75, 20}));
    }
}
