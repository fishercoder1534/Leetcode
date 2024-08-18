package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1049;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1049Test {
    private _1049.Solution1 solution1;
    private static int[] stones;

    @BeforeEach
    public void setup() {
        solution1 = new _1049.Solution1();
    }

    @Test
    public void test1() {
        stones = new int[] {2, 7, 4, 1, 8, 1};
        assertEquals(1, solution1.lastStoneWeightII(stones));
    }
}
