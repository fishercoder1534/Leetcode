package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1768;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1768Test {
    private static _1768.Solution1 solution1;
    private static _1768.Solution2 solution2;
    private static String word1;
    private static String word2;
    private static String expected;
    private static String actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _1768.Solution1();
        solution2 = new _1768.Solution2();
    }

    @Test
    public void test1() {
        word1 = "abc";
        word2 = "pqr";
        expected = "apbqcr";
        actual = solution1.mergeAlternately(word1, word2);
        Assert.assertEquals(actual, expected);
        actual = solution2.mergeAlternately(word1, word2);
        Assert.assertEquals(actual, expected);
    }
}
