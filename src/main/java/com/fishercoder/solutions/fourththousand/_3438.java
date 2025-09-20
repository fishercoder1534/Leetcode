package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3438 {
    public static class Solution1 {
        public String findValidPair(String s) {
            Map<Integer, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                int val = Character.getNumericValue(c);
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            for (int i = 0; i < s.length() - 1; i++) {
                int val = Character.getNumericValue(s.charAt(i));
                int nextVal = Character.getNumericValue(s.charAt(i + 1));
                if (val != nextVal && val == map.get(val) && nextVal == map.get(nextVal)) {
                    return val + "" + nextVal + "";
                }
            }
            return "";
        }
    }
}
