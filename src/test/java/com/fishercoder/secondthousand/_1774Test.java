package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1774;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1774Test {
    private _1774.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1774.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.closestCost(new int[] {1, 7}, new int[] {3, 4}, 10));
    }

    @Test
    public void test2() {
        assertEquals(17, solution1.closestCost(new int[] {2, 3}, new int[] {4, 5, 100}, 18));
    }

    @Test
    public void test3() {
        assertEquals(8, solution1.closestCost(new int[] {3, 10}, new int[] {2, 5}, 9));
    }
}
