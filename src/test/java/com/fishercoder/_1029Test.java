package com.fishercoder;

import com.fishercoder.solutions._1029;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1029Test {
    private static _1029.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1029.Solution1();
    }

    @Test
    public void test1() {
        /*
         * The first person goes to city A for a cost of 10.
         * The second person goes to city A for a cost of 30.
         * The third person goes to city B for a cost of 50.
         * The fourth person goes to city B for a cost of 20.

         * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
         */
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertEquals(110, solution1.twoCitySchedCost(costs));
    }
}
