package com.fishercoder;

import com.fishercoder.solutions._1160;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1160Test {
    private static _1160.Solution1 solution1;
    private static String[] words;

    @BeforeClass
    public static void setup() {
        solution1 = new _1160.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"cat", "bt", "hat", "tree"};
        assertEquals(6, solution1.countCharacters(words, "atach"));
    }

    @Test
    public void test2() {
        words = new String[]{"hello", "world", "leetcode"};
        assertEquals(10, solution1.countCharacters(words, "welldonehoneyr"));
    }
}
