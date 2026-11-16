package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

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

    public static class Solution2 {
        public String digitSum(String s, int k) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() > k) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i <= sb.length(); i += k) {
                    String substr = sb.substring(i, Math.min(i + k, sb.length()));
                    if (!substr.isEmpty()) {
                        int sum = sumDigits(substr);
                        list.add(sum);
                    }
                }
                sb.setLength(0);
                for (int num : list) {
                    sb.append(num);
                }
            }
            return sb.toString();
        }

        private Integer sumDigits(String string) {
            int sum = 0;
            for (int i = 0; i < string.length(); i++) {
                sum += Character.getNumericValue(string.charAt(i));
            }
            return sum;
        }

    }
}
