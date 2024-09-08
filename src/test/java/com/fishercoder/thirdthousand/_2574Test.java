package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.thirdthousand._2574;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2574Test {
    private _2574.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2574.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {15, 1, 11, 22}, solution1.leftRightDifference(new int[] {10, 4, 8, 3}));
    }
}
