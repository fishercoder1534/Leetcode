package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._500;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _500Test {
    private _500 test;
    private static String[] expected;
    private static String[] actual;
    private String[] words;

    @BeforeEach
    public void setup() {
        test = new _500();
    }

    @Test
    public void test1() {
        words = new String[]{"Alaska", "Hello", "Dad", "Peace"};
        expected = new String[]{"Alaska", "Dad"};
        actual = test.findWords(words);
        assertArrayEquals(expected, actual);
    }
}
