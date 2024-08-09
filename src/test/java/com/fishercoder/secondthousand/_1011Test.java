package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1011;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1011Test {
    private _1011.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1011.Solution1();
    }

    @Test
    public void test1() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(solution1.shipWithinDays(weights, 5), 15);
    }

    @Test
    public void test2() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        assertEquals(solution1.shipWithinDays(weights, 3), 6);
    }

    @Test
    public void test3() {
        int[] weights = {1, 2, 3, 1, 1};
        assertEquals(solution1.shipWithinDays(weights, 4), 3);
    }
}
