package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3913;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3913Test {
    private _3913.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3913.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("leetcedo", solution1.sortVowels("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals("baeiou", solution1.sortVowels("baeiou"));
    }

    @Test
    public void test3() {
        assertEquals("ow", solution1.sortVowels("ow"));
    }
}
