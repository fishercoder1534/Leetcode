package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _788 {
    public static class Solution1 {
        /**
         * My very original, but non-DP solution.
         */
        public int rotatedDigits(int n) {
            int count = 0;
            Map<Character, String> map = new HashMap<>();
            map.put('0', "0");
            map.put('1', "1");
            map.put('8', "8");
            map.put('2', "5");
            map.put('5', "2");
            map.put('6', "9");
            map.put('9', "6");
            for (int i = 1; i <= n; i++) {
                if (isRotatedNumber(i, map)) {
                    count++;
                }
            }
            return count;
        }

        private boolean isRotatedNumber(int num, Map<Character, String> map) {
            String originalNum = String.valueOf(num);
            StringBuilder sb = new StringBuilder();
            for (char c : String.valueOf(num).toCharArray()) {
                if (!map.containsKey(c)) {
                    return false;
                } else {
                    sb.append(map.get(c));
                }
            }
            return !originalNum.equals(sb.toString());
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/rotated-digits/discuss/117975/Java-dp-solution-9ms
         * dp[i] = 0 means invalid;
         * dp[i] = 1 means valid but the same;
         * dp[i] = 2 means valid and different.
         */
        public int rotatedDigits(int n) {
            int[] dp = new int[n + 1];
            int count = 0;
            for (int num = 0; num <= n; num++) {
                if (num < 10) {
                    if (num == 0 || num == 1 || num == 8) {
                        dp[num] = 1;
                    } else if (num == 2 || num == 5 || num == 6 || num == 9) {
                        count++;
                        dp[num] = 2;
                    }
                } else {
                    /**Here's the key/beauty of this DP solution:
                     * we could keep checking each number by reusing the previous number we worked on,
                     * basically, always break a bigger number into two parts: a number that's its right most digit and everything else, e.g.
                     * num = 12 -> 1 and 2, so we check dp[1] and dp[2] to know if 12 could be rotated to a valid number,
                     * num = 123 -> 12 and 3, so we check dp[12] and dp[3] to know if 123 could be rotated to a valid number.
                     * and so on.
                     * */
                    int a = dp[num / 10];
                    int b = dp[num % 10];
                    if (a == 1 && b == 1) {
                        //we first check if both are valid and the same, if that's the case, then we mark it as 1
                        dp[num] = 1;
                    } else if (a >= 1 && b >= 1) {
                        //then only in this case, either a or b is greater than 1, it's a valid and different number
                        dp[num] = 2;
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
