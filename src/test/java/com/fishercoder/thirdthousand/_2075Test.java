package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2075;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2075Test {
    private _2075.Solution1 solution1;
    private static String encodedText;
    private static int rows;
    private static String expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2075.Solution1();
    }

    @Test
    public void test1() {
        encodedText = "ch   ie   pr";
        rows = 3;
        expected = "cipher";
        assertEquals(expected, solution1.decodeCiphertext(encodedText, rows));
    }

    @Test
    public void test2() {
        encodedText = "iveo    eed   l te   olc";
        rows = 4;
        expected = "i love leetcode";
        assertEquals(expected, solution1.decodeCiphertext(encodedText, rows));
    }

    @Test
    public void test3() {
        encodedText = "coding";
        rows = 1;
        expected = "coding";
        assertEquals(expected, solution1.decodeCiphertext(encodedText, rows));
    }

    @Test
    public void test4() {
        encodedText = " b  ac";
        rows = 2;
        expected = " abc";
        assertEquals(expected, solution1.decodeCiphertext(encodedText, rows));
    }

}