package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._140;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class _140Test {
    private static _140.Solution1 solution1;
    private static String s;
    private static List<String> wordDict;

    @BeforeEach
    public void setup() {
        solution1 = new _140.Solution1();
    }

    @Test
    public void test1() {
        s = "catsanddog";
        wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        List<String> actual = solution1.wordBreak(s, wordDict);
        List<String> expected = Arrays.asList("cats and dog", "cat sand dog");
        //assert equals ignoring order
        assertTrue(expected.size() == actual.size() && actual.containsAll(expected) && expected.containsAll(actual));
    }

    @Test
    public void test2() {
        s = "pineapplepenapple";
        wordDict = new ArrayList<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        List<String> actual = solution1.wordBreak(s, wordDict);
        List<String> expected = Arrays.asList("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
        //assert equals ignoring order
        assertTrue(expected.size() == actual.size() && actual.containsAll(expected) && expected.containsAll(actual));
    }

    @Test
    public void test3() {
        s = "catsandog";
        wordDict = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        List<String> actual = solution1.wordBreak(s, wordDict);
        List<String> expected = Arrays.asList();
        //assert equals ignoring order
        assertTrue(expected.size() == actual.size() && actual.containsAll(expected) && expected.containsAll(actual));
    }

}
