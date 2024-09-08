package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._836;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _836Test {
    private _836.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _836.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                true, solution1.isRectangleOverlap(new int[] {0, 0, 2, 2}, new int[] {1, 1, 3, 3}));
    }

    @Test
    public void test2() {
        assertEquals(
                false,
                solution1.isRectangleOverlap(new int[] {0, 0, 1, 1}, new int[] {1, 0, 2, 1}));
    }
}
