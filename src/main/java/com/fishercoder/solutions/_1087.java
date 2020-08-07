package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1087 {
    public static class Solution1 {
        public String[] expand(String S) {
            List<char[]> letters = parse(S);
            List<String> result = backtracking(letters, 0, new StringBuilder(), new ArrayList<>());
            String[] r = result.stream().toArray(String[]::new);
            Arrays.sort(r);
            return r;
        }

        private List<String> backtracking(List<char[]> letters, int start, StringBuilder sb, List<String> result) {
            if (start >= letters.size()) {
                result.add(sb.toString());
                return result;
            }
            char[] chars = letters.get(start);
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i]);
                backtracking(letters, start + 1, sb, result);
                sb.setLength(sb.length() - 1);
            }
            return result;
        }

        private List<char[]> parse(String s) {
            List<char[]> result = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    int start = ++i;
                    while (i < s.length() && s.charAt(i) != '}') {
                        i++;
                    }
                    String[] strings = s.substring(start, i).split(",");
                    char[] chars = new char[strings.length];
                    for (int j = 0; j < strings.length; j++) {
                        chars[j] = strings[j].charAt(0);
                    }
                    result.add(chars);
                } else {
                    char[] chars = new char[1];
                    chars[0] = s.charAt(i);
                    result.add(chars);
                }
            }
            return result;
        }
    }
}
