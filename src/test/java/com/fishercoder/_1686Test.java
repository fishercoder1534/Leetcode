package com.fishercoder;

import com.fishercoder.solutions._1686;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1686Test {
    private static _1686.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1686.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(-1, solution1.stoneGameVI(new int[]{2, 4, 3}, new int[]{1, 6, 7}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.stoneGameVI(new int[]{1, 3}, new int[]{2, 1}));
    }

    @Test
    public void test3() {
        /**in this case, Alice doesn't want to take the stone with value 2, because that'll result in her loss to Bob
         * instead, she could take the stone with value 1, taking away Bob's stone with value 3, ending in a tie which is better than a loss.*/
        assertEquals(0, solution1.stoneGameVI(new int[]{1, 2}, new int[]{3, 1}));
    }
}
