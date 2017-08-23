package com.fishercoder;

import com.fishercoder.solutions._127;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/5/17.
 */
public class _127Test {
    private static _127 test;
    private static List<String> wordList;

    @BeforeClass
    public static void setup() {
        test = new _127();
    }

    @Test
    public void test1() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        assertEquals(0, test.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void test2() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        assertEquals(5, test.ladderLength("hit", "cog", wordList));
    }
}
