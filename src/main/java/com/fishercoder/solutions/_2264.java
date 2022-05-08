package com.fishercoder.solutions;

public class _2264 {
    public static class Solution1 {
        public String largestGoodInteger(String num) {
            String ans = "";
            int max = 0;
            for (int i = 0; i < num.length() - 2; i++) {
                if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                    int candidate = Integer.parseInt(num.substring(i, i + 3));
                    if (candidate >= max) {
                        max = candidate;
                        ans = num.substring(i, i + 3);
                    }
                    i += 2;
                }
            }
            return ans;
        }
    }
}
