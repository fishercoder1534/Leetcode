package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3456 {
    public static class Solution1 {
        public boolean hasSpecialSubstring(String s, int k) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            List<Character> candidateList = new ArrayList<>();
            for (char c : map.keySet()) {
                if (map.get(c) >= k) {
                    candidateList.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : candidateList) {
                int count = k;
                while (count-- > 0) {
                    sb.append(c);
                }
                String substring = sb.toString();
                sb.setLength(0);
                List<Integer> indexes = findAllIndexes(s, substring);
                for (int index : indexes) {
                    if (index == -1) {
                        continue;
                    }
                    if (index == 0) {
                        if (k == s.length()) {
                            return true;
                        } else if (s.charAt(k) != c) {
                            return true;
                        }
                    } else if (index == s.length() - k && s.charAt(index - 1) != c) {
                        return true;
                    } else {
                        if (s.charAt(index - 1) != c && s.charAt(index + k) != c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private List<Integer> findAllIndexes(String s, String substring) {
            List<Integer> indexes = new ArrayList<>();
            int index = s.indexOf(substring);
            while (index != -1) {
                indexes.add(index);
                index = s.indexOf(substring, index + substring.length());
            }
            return indexes;
        }
    }
}
