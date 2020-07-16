package com.fishercoder.solutions;

import java.util.Arrays;

public class _455 {

    public static class Solution1 {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);

            int result = 0;
            for (int i = 0, j = 0; i < g.length && j < s.length; ) {
                if (s[j] >= g[i]) {
                    result++;
                    i++;
                }
                j++;
            }
            return result;
        }
    }

}
