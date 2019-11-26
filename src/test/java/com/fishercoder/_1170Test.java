package com.fishercoder;

import com.fishercoder.solutions._1170;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1170Test {
    private static _1170.Solution1 solution1;
    private static _1170.Solution2 solution2;
    private static String[] queries;
    private static String[] words;

    @BeforeClass
    public static void setup() {
        solution1 = new _1170.Solution1();
        solution2 = new _1170.Solution2();
    }

    @Test
    public void test1() {
        queries = new String[]{"cbd"};
        words = new String[]{"zaaaz"};
        assertArrayEquals(new int[]{1}, solution1.numSmallerByFrequency(queries, words));
    }

    @Test
    public void test2() {
        queries = new String[]{"bbb", "cc"};
        words = new String[]{"a", "aa", "aaa", "aaaa"};
        assertArrayEquals(new int[]{1, 2}, solution1.numSmallerByFrequency(queries, words));
    }

    @Test
    public void test3() {
        queries = new String[]{"cbd"};
        words = new String[]{"zaaaz"};
        assertArrayEquals(new int[]{1}, solution2.numSmallerByFrequency(queries, words));
    }

    @Test
    public void test4() {
        queries = new String[]{"bbb", "cc"};
        words = new String[]{"a", "aa", "aaa", "aaaa"};
        assertArrayEquals(new int[]{1, 2}, solution2.numSmallerByFrequency(queries, words));
    }

}