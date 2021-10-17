package com.fishercoder.solutions;

public class _2038 {
    public static class Solution1 {
        public boolean winnerOfGame(String colors) {
            int ans = 0;
            for (int i = 1; i < colors.length() - 1; i++) {
                if (colors.charAt(i) == colors.charAt(i - 1) && colors.charAt(i) == colors.charAt(i + 1)) {
                    if (colors.charAt(i) == 'A') {
                        ans++;
                    } else {
                        ans--;
                    }
                }
            }
            return ans > 0;
        }
    }
}
