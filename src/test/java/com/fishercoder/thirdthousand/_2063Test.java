package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2063;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2063Test {
    private _2063.Solution1 solution1;
    private static String word;
    private static long expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2063.Solution1();
    }

    @Test
    public void test1() {
        word = "aba";
        expected = 6L;
        assertEquals(expected, solution1.countVowels(word));
    }

}