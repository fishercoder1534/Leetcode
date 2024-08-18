package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1046;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1046Test {
    private _1046.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1046.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    }
}
