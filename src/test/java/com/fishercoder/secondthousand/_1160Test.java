package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1160;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1160Test {
    private _1160.Solution1 solution1;
    private static String[] words;

    @BeforeEach
    public void setup() {
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
