package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.Map;

public class _13 {

    public static class Solution1 {
        /**
         * This is the most concise/elegant version to solve this problem:
         * 1. use a map to hold the roman to numeric mappings;
         * 2. we always add the number (corresponding from the char) first, then once we find that a later char has a corresponding value that is bigger than the previous char,
         * we deduct 2 * previousCharCorrespondingValue
         * <p>
         * e.g. XIV step by step is computed below:
         * 0 + 10 = 10
         * 10 + 1 = 11
         * 11 + (5 - 2*1) = 14
         */
        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                    result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
                } else {
                    result += map.get(s.charAt(i));
                }
            }
            return result;
        }
    }

}
