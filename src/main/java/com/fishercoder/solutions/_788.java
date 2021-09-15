package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _788 {
    public static class Solution1 {
        /**
         * My very original, but non-DP solution.
         */
        public int rotatedDigits(int N) {
            int count = 0;
            Map<Character, String> map = new HashMap<>();
            map.put('0', "0");
            map.put('1', "1");
            map.put('8', "8");
            map.put('2', "5");
            map.put('5', "2");
            map.put('6', "9");
            map.put('9', "6");
            for (int i = 1; i <= N; i++) {
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
}
