package com.fishercoder.solutions;

public class _2269 {
    public static class Solution1 {
        public int divisorSubstrings(int num, int k) {
            String numStr = new StringBuilder().append(num).toString();
            int ans = 0;
            for (int i = 0; i + k <= numStr.length(); i++) {
                String candidate = numStr.substring(i, i + k);
                int integer = Integer.parseInt(candidate);
                if (integer == 0) {
                    continue;
                }
                if (num % integer == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
