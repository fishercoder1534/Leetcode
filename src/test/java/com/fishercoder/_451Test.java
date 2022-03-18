package com.fishercoder;

import com.fishercoder.solutions._451;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _451Test {
    private static _451.Solution1 solution1;
    private static _451.Solution2 solution2;
    private static String expected;
    private static String input;

    @BeforeClass
    public static void setup() {
        solution1 = new _451.Solution1();
        solution2 = new _451.Solution2();
    }

    @Test
    public void test1() {
        input = "tree";
        expected = "eert";
        assertEquals(expected, solution1.frequencySort(input));
        assertEquals(expected, solution2.frequencySort(input));
    }

    @Test
    public void test2() {
        input = "cccaaa";
        expected = "aaaccc";
        assertEquals(expected, solution1.frequencySort(input));
        assertEquals(expected, solution2.frequencySort(input));
    }

    @Test
    public void test3() {
        input = "Aabb";
        expected = "bbAa";
        assertEquals(expected, solution1.frequencySort(input));
        assertEquals(expected, solution2.frequencySort(input));
    }
}
