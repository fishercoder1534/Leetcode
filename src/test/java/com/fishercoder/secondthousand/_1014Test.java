package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1014;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1014Test {
    private _1014.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1014.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(solution1.maxScoreSightseeingPair(new int[] {1, 3, 5}), 7);
    }

    @Test
    public void test2() {
        assertEquals(solution1.maxScoreSightseeingPair(new int[] {8, 1, 5, 2, 6}), 11);
    }
}
