package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _288 {
    public static class Solution1 {

        public class ValidWordAbbr {
            private Map<String, String> dict;

            public ValidWordAbbr(String[] dictionary) {
                dict = new HashMap();
                for (String word : dictionary) {
                    String key = word.length() <= 2 ? word : (word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
                    if (dict.containsKey(key) && !dict.get(key).equals(word)) {
                        dict.put(key, "");
                    } else {
                        dict.put(key, word);
                    }
                }
            }

            public boolean isUnique(String word) {
                String key = word.length() <= 2 ? word : (word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
                if (!dict.containsKey(key)) {
                    return true;
                } else {
                    return dict.get(key) != "" && dict.get(key).equals(word);
                }
            }
        }
    }

    public static class Solution2 {
        public class ValidWordAbbr {

            private Map<String, Set<String>> dict;

            public ValidWordAbbr(String[] dictionary) {
                dict = new HashMap();
                for (String word : dictionary) {
                    String key = word.length() <= 2 ? word : (word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
                    if (dict.containsKey(key)) {
                        Set<String> set = dict.get(key);
                        set.add(word);
                        dict.put(key, set);
                    } else {
                        Set<String> set = new HashSet();
                        set.add(word);
                        dict.put(key, set);
                    }
                }
            }

            public boolean isUnique(String word) {
                String key = word.length() <= 2 ? word : (word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
                if (!dict.containsKey(key)) {
                    return true;
                } else {
                    Set<String> set = dict.get(key);
                    if (set.size() != 1) {
                        return false;
                    }
                    Iterator<String> it = set.iterator();
                    return it.next().equals(word);
                }
            }
        }
    }
}
