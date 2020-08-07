package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _1079 {
    public static class Solution1 {
        public int numTilePossibilities(String tiles) {
            char[] chars = tiles.toCharArray();
            Arrays.sort(chars);
            boolean[] used = new boolean[chars.length];
            StringBuilder sb = new StringBuilder();
            List<String> result = new ArrayList<>();
            dfs(chars, used, sb, result);
            return result.size();
        }

        private void dfs(char[] chars, boolean[] used, StringBuilder sb, List<String> result) {
            if (sb.length() != 0) {
                result.add(sb.toString());
            }
            IntStream.range(0, chars.length)
                    .filter(i -> !used[i])
                    .filter(i -> i <= 0 || chars[i - 1] != chars[i] || used[i - 1])
                    .forEach(i -> {
                        used[i] = true;
                        sb.append(chars[i]);
                        dfs(chars, used, sb, result);
                        used[i] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    });
        }
    }
}
