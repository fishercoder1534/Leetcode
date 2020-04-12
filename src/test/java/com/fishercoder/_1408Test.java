package com.fishercoder;

import com.fishercoder.solutions._1408;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1408Test {
    private static _1408.Solution1 solution1;
    private static String[] words;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _1408.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"mass", "as", "hero", "superhero"};
        expected = Arrays.asList("as", "hero");
        actual = solution1.stringMatching(words);
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
    }

}