package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _271 {
    public static class Solution1 {
        // Encodes a list of strings to a single string.
        public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for (String s : strs) {
                sb.append(s.length()).append('/').append(s);
            }
            return sb.toString();
        }

        // Decodes a single string to a list of strings.
        public List<String> decode(String s) {
            List<String> result = new ArrayList<>();
            int i = 0;
            while (i < s.length()) {
                int slash = s.indexOf('/', i);
                int size = Integer.valueOf(s.substring(i, slash));
                result.add(s.substring(slash + 1, slash + 1 + size));
                i = slash + size + 1;
            }
            return result;
        }
    }
}
