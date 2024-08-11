package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1217;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1217Test {
    private _1217.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1217.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minCostToMoveChips(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
    }

}