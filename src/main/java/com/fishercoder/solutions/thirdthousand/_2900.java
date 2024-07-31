package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2900 {
    public static class Solution1 {
        public List<String> getLongestSubsequence(String[] words, int[] groups) {
            int longest = 0;
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                List<String> candidate = new ArrayList<>();
                candidate.add(words[i]);
                int lastBit = groups[i];
                for (int j = i + 1; j < words.length; j++) {
                    if (groups[j] != lastBit) {
                        candidate.add(words[j]);
                        lastBit = groups[j];
                    }
                }
                if (candidate.size() > longest) {
                    longest = candidate.size();
                    ans = candidate;
                }
            }
            return ans;
        }
    }
}
