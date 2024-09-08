package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._84;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _84Test {
    private _84.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _84.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, (solution1.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3})));
    }
}
