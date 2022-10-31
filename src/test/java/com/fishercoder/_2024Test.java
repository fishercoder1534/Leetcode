package com.fishercoder;

import com.fishercoder.solutions._2024;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2024Test {
    private static _2024.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2024.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxConsecutiveAnswers("TTFF", 2));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.maxConsecutiveAnswers("TFFT", 1));
    }

    @Test
    public void test3() {
        assertEquals(5, solution1.maxConsecutiveAnswers("TTFTTFTT", 1));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.maxConsecutiveAnswers("F", 1));
    }

    @Test
    public void test5() {
        assertEquals(8, solution1.maxConsecutiveAnswers("FFFTTFTTFT", 3));
    }

}
