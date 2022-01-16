package com.fishercoder.solutions;

public class _2138 {
    public static class Solution1 {
        public String[] divideString(String s, int k, char fill) {
            int len = s.length() / k;
            if (s.length() % k != 0) {
                len++;
            }
            String[] ans = new String[len];
            for (int i = 0, j = 0; i < s.length(); i += k, j++) {
                if (j == len - 1) {
                    StringBuilder sb = new StringBuilder(s.substring(i));
                    if (sb.length() != k) {
                        while (sb.length() < k) {
                            sb.append(fill);
                        }
                    }
                    ans[j] = sb.toString();
                } else {
                    ans[j] = s.substring(i, i + k);
                }
            }
            return ans;
        }
    }
}
