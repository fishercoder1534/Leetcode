package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _830 {
    public static class Solution1 {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> result = new ArrayList<>();
            char[] chars = S.toCharArray();
            for (int i = 0; i < chars.length; ) {
                char first = chars[i];
                int j = i + 1;
                while (j < chars.length && first == chars[j]) {
                    j++;
                }
                if ((j - i) >= 3) {
                    result.add(Arrays.asList(i, j - 1));
                }
                i = j;
            }
            return result;
        }
    }
}
