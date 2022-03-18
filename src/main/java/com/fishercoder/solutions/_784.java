package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _784 {
    public static class Solution1 {
        public List<String> letterCasePermutation(String S) {
            Set<String> result = new HashSet<>();
            result.add(S);
            for (int i = 0; i < S.length(); i++) {
                if (Character.isAlphabetic(S.charAt(i))) {
                    Set<String> newResult = new HashSet<>();
                    for (String word : result) {
                        if (Character.isUpperCase(word.charAt(i))) {
                            StringBuilder sb = new StringBuilder();
                            for (int j = 0; j < i; j++) {
                                sb.append(word.charAt(j));
                            }
                            sb.append(Character.toLowerCase(word.charAt(i)));
                            for (int j = i + 1; j < word.length(); j++) {
                                sb.append(word.charAt(j));
                            }
                            newResult.add(sb.toString());
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (int j = 0; j < i; j++) {
                                sb.append(word.charAt(j));
                            }
                            sb.append(Character.toUpperCase(word.charAt(i)));
                            for (int j = i + 1; j < word.length(); j++) {
                                sb.append(word.charAt(j));
                            }
                            newResult.add(sb.toString());
                        }
                    }
                    result.addAll(newResult);
                }
            }
            return new ArrayList<>(result);
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/11/2021.
         */
        public List<String> letterCasePermutation(String s) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return recursion(s, ans, 0);
        }

        private List<String> recursion(String s, List<String> ans, int start) {
            if (start >= s.length()) {
                return ans;
            }
            List<String> newList = new ArrayList<>();
            int index = start;
            while (start < s.length() && Character.isDigit(s.charAt(start))) {
                start++;
            }
            String digits = "";
            if (start > index) {
                digits = s.substring(index, start);
            }
            for (String str : ans) {
                if (start < s.length()) {
                    newList.add(str + digits + Character.toUpperCase(s.charAt(start)));
                    newList.add(str + digits + Character.toLowerCase(s.charAt(start)));
                } else {
                    newList.add(str + digits);
                }
            }
            return recursion(s, newList, start + 1);
        }
    }
}
