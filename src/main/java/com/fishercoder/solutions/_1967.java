package com.fishercoder.solutions;

import java.util.Arrays;

public class _1967 {
    public static class Solution1 {
        public int numOfStrings(String[] patterns, String word) {
            return (int) Arrays.stream(patterns).filter(p -> word.indexOf(p) != -1).count();
        }
    }
}
