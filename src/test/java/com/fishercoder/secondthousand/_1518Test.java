package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1518;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1518Test {
    private _1518.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1518.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.numWaterBottles(9, 3));
    }

    @Test
    public void test2() {
        assertEquals(19, solution1.numWaterBottles(15, 4));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.numWaterBottles(5, 5));
    }
}
