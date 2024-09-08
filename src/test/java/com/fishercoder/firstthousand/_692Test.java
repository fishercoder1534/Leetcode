package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._692;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _692Test {
    private _692.Solution1 solution1;
    private static String[] words;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeEach
    public void setup() {
        solution1 = new _692.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
        actual = solution1.topKFrequent(words, 2);
        expected = new ArrayList<>(Arrays.asList("i", "love"));
        assertEquals(expected, actual);
    }
}
