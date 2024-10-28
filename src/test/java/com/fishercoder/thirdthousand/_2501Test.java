package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2501;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2501Test {
    private _2501.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2501.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.longestSquareStreak(new int[] {4, 3, 6, 16, 8, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.longestSquareStreak(new int[] {2, 3, 5, 6, 7}));
    }
}
