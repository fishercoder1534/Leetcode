package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4106 {
    public static class Solution1 {
        public List<List<String>> findMismatchedSegments(String s1, String s2) {
            List<List<String>> ans = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                int j = i;
                while (j < s1.length() && s1.charAt(j) != s2.charAt(j)) {
                    j++;
                }
                if (j > i) {
                    ans.add(Arrays.asList(s1.substring(i, j), s2.substring(i, j)));
                }
                i = j;
            }
            return ans;
        }
    }
}
