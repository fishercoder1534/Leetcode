package com.fishercoder;

import com.fishercoder.solutions._84;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _84Test {
    private static _84.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _84.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, (solution1.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3})));
    }

}
