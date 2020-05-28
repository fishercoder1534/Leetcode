package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _290 {

    public static class Solution1 {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");
            char[] patterns = pattern.toCharArray();
            Map<Character, String> map = new HashMap();
            if (patterns.length != words.length) {
                return false;
            }
            for (int i = 0; i < patterns.length; i++) {
                if (map.containsKey(patterns[i])) {
                    if (!map.get(patterns[i]).equals(words[i])) {
                        return false;
                    }
                } else {
                    if (map.containsValue(words[i])) {
                        return false;//this is for this case: "abba", "dog dog dog dog"
                    }
                    map.put(patterns[i], words[i]);
                }
            }
            return true;
        }
    }

}