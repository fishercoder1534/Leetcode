package com.fishercoder;

import com.fishercoder.solutions._1804;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1804Test {
    private static _1804.Solution1.Trie solution1;

    @BeforeClass
    public static void setup() {

    }

    @Test
    public void test1() {
        solution1 = new _1804.Solution1.Trie();
        solution1.insert("apple");
        solution1.insert("apple");
        assertEquals(2, solution1.countWordsEqualTo("apple"));
        assertEquals(2, solution1.countWordsStartingWith("app"));
        solution1.erase("apple");
        assertEquals(1, solution1.countWordsEqualTo("apple"));
        assertEquals(1, solution1.countWordsStartingWith("app"));
        solution1.erase("apple");
        assertEquals(0, solution1.countWordsStartingWith("app"));
    }

}
