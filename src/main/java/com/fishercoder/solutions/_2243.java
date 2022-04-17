package com.fishercoder.solutions;

public class _2243 {
    public static class Solution1 {
        public String digitSum(String s, int k) {
            StringBuilder sb = new StringBuilder();
            while (s.length() > k) {
                for (int i = 0; i < s.length(); i += k) {
                    int sum = 0;
                    for (int j = i; j < i + k && j < s.length(); j++) {
                        sum += Integer.parseInt(s.charAt(j) + "");
                    }
                    sb.append(sum);
                }
                s = sb.toString();
                sb.setLength(0);
            }
            return s;
        }
    }
}
