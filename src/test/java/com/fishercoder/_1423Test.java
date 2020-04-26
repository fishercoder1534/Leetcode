package com.fishercoder;

import com.fishercoder.solutions._1423;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1423Test {
    private static _1423.Solution1 solution1;
    private static int[] cardPoints;

    @BeforeClass
    public static void setup() {
        solution1 = new _1423.Solution1();
    }

    @Test
    public void test1() {
        cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        assertEquals(12, solution1.maxScore(cardPoints, 3));
    }

}