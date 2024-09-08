package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2559 {
    public static class Solution1 {
        public int[] vowelStrings(String[] words, int[][] queries) {
            int[] ans = new int[queries.length];
            boolean[] vowels = new boolean[words.length];
            Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            int i = 0;
            for (String word : words) {
                if (word.length() == 1) {
                    if (set.contains(word.charAt(0))) {
                        vowels[i] = true;
                    }
                } else if (set.contains(word.charAt(0))
                        && set.contains(word.charAt(word.length() - 1))) {
                    vowels[i] = true;
                }
                i++;
            }
            int[] preSums = new int[words.length];
            preSums[0] = vowels[0] == true ? 1 : 0;
            for (int k = 1; k < words.length; k++) {
                if (vowels[k]) {
                    preSums[k] = preSums[k - 1] + 1;
                } else {
                    preSums[k] = preSums[k - 1];
                }
            }
            i = 0;
            for (int[] query : queries) {
                int start = query[0];
                int end = query[1];
                if (start == 0) {
                    ans[i++] = preSums[end];
                } else {
                    ans[i++] = preSums[end] - preSums[start - 1];
                }
            }
            return ans;
        }
    }
}
