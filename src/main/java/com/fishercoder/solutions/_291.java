package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _291 {

    public static class Solution1 {
        /**
         * We can try recursively:
         * say pattern is "abab", str is "redblueredblue"
         * first we try if "a" matches with "r", "b" matches with "e", we find it's not, so we try to see if "b" matches "ed", and so on ...
         * then eventually, we find this pattern:
         * "a" matches "red"
         * "b" matches "blue"
         * then we'll just finish the str check based on this pattern
         */
        public boolean wordPatternMatch(String pattern, String str) {
            Map<Character, String> map = new HashMap();
            Set<String> set = new HashSet();
            return isMatch(str, 0, pattern, 0, map, set);
        }

        private boolean isMatch(String str, int i, String pattern, int j, Map<Character, String> map, Set<String> set) {
            //base case
            if (i == str.length() && j == pattern.length()) {
                return true;
            }
            if (i == str.length() || j == pattern.length()) {
                return false;
            }

            char c = pattern.charAt(j);

            if (map.containsKey(c)) {
                String s = map.get(c);

                //check to see if we can use s to match str.substring(i, i + s.length())
                if (!str.startsWith(s, i)) {
                    return false;
                }

                //if it's match, great, then let's check the rest
                return isMatch(str, i + s.length(), pattern, j + 1, map, set);
            }

            for (int k = i; k < str.length(); k++) {
                String p = str.substring(i, k + 1);

                if (set.contains(p)) {
                    continue;
                }

                map.put(c, p);
                set.add(p);

                //continue to match the rest
                if (isMatch(str, k + 1, pattern, j + 1, map, set)) {
                    return true;
                }

                //backtracking
                map.remove(c);
                set.remove(p);
            }

            //we've tried everything, but still no luck
            return false;
        }
    }
}
