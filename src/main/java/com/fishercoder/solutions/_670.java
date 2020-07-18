package com.fishercoder.solutions;

public class _670 {
    public static class Solution1 {
        public int maximumSwap(int num) {
            String numStr = String.valueOf(num);
            int max = num;
            for (int i = 0; i < numStr.length() - 1; i++) {
                for (int j = i + 1; j < numStr.length(); j++) {
                    if (numStr.charAt(i) < numStr.charAt(j)) {
                        StringBuilder sb = new StringBuilder(numStr);
                        sb.replace(i, i + 1, String.valueOf(numStr.charAt(j)));
                        sb.replace(j, j + 1, String.valueOf(numStr.charAt(i)));
                        max = Math.max(max, Integer.parseInt(sb.toString()));
                    }
                }
            }
            return max;
        }
    }
}
