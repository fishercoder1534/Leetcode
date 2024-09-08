package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1043;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1043Test {
    private _1043.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1043.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(84, solution1.maxSumAfterPartitioning(new int[] {1, 15, 7, 9, 2, 5, 10}, 3));
    }
}
