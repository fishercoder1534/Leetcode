package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._884;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _884Test {
    private _884.Solution1 solution1;
    private static String[] expected;

    @BeforeEach
    public void setUp() {
        solution1 = new _884.Solution1();
    }

    @Test
    public void test1() {
        expected = new String[] {"sweet", "sour"};
        assertArrayEquals(
                expected,
                solution1.uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }

    @Test
    public void test2() {
        expected = new String[] {"banana"};
        assertArrayEquals(expected, solution1.uncommonFromSentences("apple apple", "banana"));
    }
}
