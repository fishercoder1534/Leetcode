package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _527 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/82613/really-simple-and-straightforward-java-solution
         */
        public List<String> wordsAbbreviation(List<String> dict) {
            int len = dict.size();
            String[] ans = new String[len];
            int[] prefix = new int[len];
            for (int i = 0; i < len; i++) {
                prefix[i] = 1;
                ans[i] = abbreviate(dict.get(i), 1); // make abbreviation for each string
            }
            for (int i = 0; i < len; i++) {
                while (true) {
                    HashSet<Integer> set = new HashSet<>();
                    for (int j = i + 1; j < len; j++) {
                        if (ans[j].equals(ans[i])) {
                            set.add(j); // check all strings with the same abbreviation
                        }
                    }
                    if (set.isEmpty()) {
                        break;
                    }
                    set.add(i);
                    for (int k : set) {
                        ans[k] = abbreviate(dict.get(k), ++prefix[k]); // increase the prefix
                    }
                }
            }
            return Arrays.asList(ans);
        }

        private String abbreviate(String word, int k) {
            if (k + 2 >= word.length()) {
                return word;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(word.substring(0, k));
            stringBuilder.append(word.length() - 1 - k);
            stringBuilder.append(word.substring(word.length() - 1));
            return stringBuilder.toString();
        }
    }

}
