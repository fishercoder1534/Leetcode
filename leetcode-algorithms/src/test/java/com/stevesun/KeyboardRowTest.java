package com.stevesun;

import com.stevesun.solutions.KeyboardRow;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by stevesun on 1/15/17.
 */
public class KeyboardRowTest {
    private static KeyboardRow test;
    private static String[] expected;
    private static String[] actual;
    private String[] words;

    @BeforeClass
    public static void setup(){
        test = new KeyboardRow();
    }

    @Test
    public void test1(){
        words = new String[]{"Alaska", "Hello", "Dad", "Peace"};
        expected = new String[]{"Alaska", "Dad"};
        actual = test.findWords(words);
        assertArrayEquals(expected, actual);
    }
}
