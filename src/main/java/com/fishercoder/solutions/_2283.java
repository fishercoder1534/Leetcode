package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2283 {
    public static class Solution1 {
        public boolean digitCount(String num) {
            Map<Integer, Integer> map = new HashMap<>();
            for (char c : num.toCharArray()) {
                int n = Character.getNumericValue(c);
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            for (int i = 0; i < num.length(); i++) {
                int n = Character.getNumericValue(num.charAt(i));
                int times = map.getOrDefault(i, 0);
                if (n != times) {
                    return false;
                }
            }
            return true;
        }
    }
}
