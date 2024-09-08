package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.thirdthousand._2670;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2670Test {
    private _2670.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2670.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {-2, -1, 0, 2, 3},
                solution1.distinctDifferenceArray(new int[] {3, 2, 3, 4, 2}));
    }
}
