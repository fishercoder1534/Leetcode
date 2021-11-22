package com.fishercoder;

import com.fishercoder.solutions._2063;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2063Test {
    private static _2063.Solution1 solution1;
    private static String word;
    private static long expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2063.Solution1();
    }

    @Test
    public void test1() {
        word = "aba";
        expected = 6L;
        assertEquals(expected, solution1.countVowels(word));
    }

}