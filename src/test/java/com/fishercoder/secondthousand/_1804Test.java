package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1804;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1804Test {
    private _1804.Solution1.Trie solution1;

    @BeforeEach
    public void setup() {}

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
