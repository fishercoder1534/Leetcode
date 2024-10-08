package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1388;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1388Test {
    private _1388.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1388.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.maxSizeSlices(new int[] {1, 2, 3, 4, 5, 6}));
    }
}
