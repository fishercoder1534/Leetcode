package com.fishercoder;

import com.fishercoder.solutions._692;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _692Test {
    private static _692.Solution1 solution1;
    private static String[] words;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _692.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        actual = solution1.topKFrequent(words, 2);
        expected = new ArrayList<>(Arrays.asList("i", "love"));
        assertEquals(expected, actual);
    }

}