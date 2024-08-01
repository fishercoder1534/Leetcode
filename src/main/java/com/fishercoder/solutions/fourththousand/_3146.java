package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3146 {
    public static class Solution1 {
        public int findPermutationDifference(String s, String t) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), i);
            }
            int sum = 0;
            for (int i = 0; i < t.length(); i++) {
                sum += Math.abs(map.get(t.charAt(i)) - i);
            }
            return sum;
        }
    }
}
