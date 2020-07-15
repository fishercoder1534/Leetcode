package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;

public class _522 {

    public static class Solution1 {
        /**
         * Idea: if there's such a LUS there in the list, it must be one of the strings in the given list,
         * so we'll just go through the list and check if one string is NOT subsequence of any others, if so, return it, otherwise, return -1
         */
        public int findLUSlength(String[] strs) {
            Arrays.sort(strs, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

            for (int i = 0; i < strs.length; i++) {
                boolean found = true;
                for (int j = 0; j < strs.length; j++) {
                    if (i == j) {
                        continue;
                    } else if (isSubsequence(strs[i], strs[j])) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return strs[i].length();
                }
            }
            return -1;
        }

        private boolean isSubsequence(String a, String b) {
            int i = 0;
            for (int j = 0; i < a.length() && j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                }
            }
            return i == a.length();
        }
    }
}
