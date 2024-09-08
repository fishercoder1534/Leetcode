package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._720;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _720Test {
    private _720.Solution1 solution1;
    private static String[] words;

    @BeforeEach
    public void setup() {
        solution1 = new _720.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"w", "wo", "wor", "worl", "world"};
        assertEquals("world", solution1.longestWord(words));
    }

    @Test
    public void test2() {
        words = new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        assertEquals("apple", solution1.longestWord(words));
    }
}
