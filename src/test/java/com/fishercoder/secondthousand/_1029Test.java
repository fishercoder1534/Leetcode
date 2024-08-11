package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1029;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1029Test {
    private _1029.Solution1 solution1;
    private static int[][] costs;

    @BeforeEach
    public void setup() {
        solution1 = new _1029.Solution1();
    }

    @Test
    public void test1() {
        costs = new int[][]{
                {10, 20},
                {30, 200},
                {400, 50},
                {30, 20}
        };
        assertEquals(110, solution1.twoCitySchedCost(costs));
    }

    @Test
    public void test2() {
        costs = new int[][]{
                {259, 770},
                {448, 54},
                {926, 667},
                {184, 139},
                {840, 118},
                {577, 469}
        };
        assertEquals(1859, solution1.twoCitySchedCost(costs));
    }

}