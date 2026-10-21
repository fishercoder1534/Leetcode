package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2542;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2542Test {
    private _2542.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2542.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3));
    }

    @Test
    public void test2() {
        assertEquals(30, solution1.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }

    @Test
    public void test3() {
        assertEquals(168, solution1.maxScore(new int[]{2, 1, 14, 12}, new int[]{11, 7, 13, 6}, 3));
    }

}
