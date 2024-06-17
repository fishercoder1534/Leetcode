package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1423;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1423Test {
    private static _1423.Solution1 solution1;
    private static _1423.Solution2 solution2;
    private static int[] cardPoints;
    private static int expected;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _1423.Solution1();
        solution2 = new _1423.Solution2();
    }

    @Test
    public void test1() {
        cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        expected = 12;
        k = 3;
        assertEquals(expected, solution1.maxScore(cardPoints, k));
        assertEquals(expected, solution2.maxScore(cardPoints, k));
    }

    @Test
    public void test2() {
        cardPoints = new int[]{96, 90, 41, 82, 39, 74, 64, 50, 30};
        expected = 536;
        k = 8;
        assertEquals(expected, solution1.maxScore(cardPoints, k));
        assertEquals(expected, solution2.maxScore(cardPoints, k));
    }

    @Test
    public void test3() {
        cardPoints = new int[]{100, 40, 17, 9, 73, 75};
        expected = 248;
        k = 3;
        assertEquals(expected, solution1.maxScore(cardPoints, k));
        assertEquals(expected, solution2.maxScore(cardPoints, k));
    }

}