package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._953;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _953Test {
    private _953.Solution1 solution1;
    private _953.Solution2 solution2;
    private static String[] words;
    private static String order;

    @BeforeEach
    public void setup() {
        solution1 = new _953.Solution1();
        solution2 = new _953.Solution2();
    }

    @Test
    public void test1() {
        words = new String[] {"hello", "leetcode"};
        order = "hlabcdefgijkmnopqrstuvwxyz";
        assertEquals(true, solution1.isAlienSorted(words, order));
        assertEquals(true, solution2.isAlienSorted(words, order));
    }

    @Test
    public void test2() {
        words = new String[] {"word", "world", "row"};
        order = "worldabcefghijkmnpqstuvxyz";
        assertEquals(false, solution1.isAlienSorted(words, order));
        assertEquals(false, solution2.isAlienSorted(words, order));
    }

    @Test
    public void test3() {
        words = new String[] {"apple", "app"};
        order = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(false, solution1.isAlienSorted(words, order));
        assertEquals(false, solution2.isAlienSorted(words, order));
    }
}
