package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _266 {

    public static class Solution1 {
        public boolean canPermutePalindrome(String s) {

            char[] chars = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chars) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
            int evenCount = 0;
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() % 2 != 0) {
                    evenCount++;
                }
                if (evenCount > 1) {
                    return false;
                }
            }
            return true;
        }
    }

}
