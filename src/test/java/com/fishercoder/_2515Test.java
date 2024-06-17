package com.fishercoder;

import com.fishercoder.solutions.thirdthousand._2515;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2515Test {
    private static _2515.Solution1 solution1;
    private static String[] words;

    @BeforeClass
    public static void setup() {
        solution1 = new _2515.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"hello", "i", "am", "leetcode", "hello"};
        assertEquals(1, solution1.closetTarget(words, "hello", 1));
    }

    @Test
    public void test2() {
        words = new String[]{"a", "b", "leetcode"};
        assertEquals(1, solution1.closetTarget(words, "leetcode", 0));
    }

    @Test
    public void test3() {
        words = new String[]{"i", "eat", "leetcode"};
        assertEquals(-1, solution1.closetTarget(words, "ate", 0));
    }

}