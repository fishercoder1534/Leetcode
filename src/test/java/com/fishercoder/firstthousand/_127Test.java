package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._127;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _127Test {
    private _127.Solution1 solution1;
    private static List<String> wordList;

    @BeforeEach
    public void setUp() {
        solution1 = new _127.Solution1();
    }

    @Test
    public void test1() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        assertEquals(0, solution1.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void test2() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        assertEquals(5, solution1.ladderLength("hit", "cog", wordList));
    }
}
