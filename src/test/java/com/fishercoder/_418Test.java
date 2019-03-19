package com.fishercoder;

import com.fishercoder.solutions._418;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _418Test {
    private static _418.Solution1 test;
    private static String[] sentence;

    @BeforeClass
    public static void setup() {
        test = new _418.Solution1();
    }

    @Test
    public void test1() {
        sentence = new String[]{"hello", "world"};
        assertEquals(1, test.wordsTyping(sentence, 2, 8));
    }

    @Test
    public void test2() {
        sentence = new String[]{"a", "bcd", "e"};
        assertEquals(2, test.wordsTyping(sentence, 3, 6));
    }

    @Test
    public void test3() {
        sentence = new String[]{"I", "had", "apple", "pie"};
        assertEquals(1, test.wordsTyping(sentence, 4, 5));
    }

    @Test
    public void test4() {
        sentence = new String[]{"f", "p", "a"};
        assertEquals(10, test.wordsTyping(sentence, 8, 7));
    }

    @Test
    public void test5() {
        sentence = new String[]{"hello", "leetcode"};
        assertEquals(1, test.wordsTyping(sentence, 1, 20));
    }

    @Test
    public void test6() {
        sentence = new String[]{"h"};
        assertEquals(4, test.wordsTyping(sentence, 2, 3));
    }
}
