package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1930 {
    public static class Solution1 {
        public int countPalindromicSubsequence(String s) {
            Map<Character, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                List<Integer> list = map.getOrDefault(s.charAt(i), new ArrayList<>());
                list.add(i);
                map.put(s.charAt(i), list);
            }
            Set<String> set = new HashSet<>();
            Set<Character> firstChars = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (firstChars.add(s.charAt(i))) {
                    if (map.get(s.charAt(i)).size() > 1) {
                        //now iterate through each char as the 2nd character of the 3-char subsequence
                        for (char c = 'a'; c <= 'z'; c++) {
                            List<Integer> listFor2ndChar = map.getOrDefault(c, new ArrayList<>());
                            if (listFor2ndChar.isEmpty()
                                    || listFor2ndChar.get(listFor2ndChar.size() - 1) <= i) {
                                continue;
                            }
                            List<Integer> listFor3rdChar = map.get(s.charAt(i));
                            Integer lastIndexFor3rdChar = listFor3rdChar.get(listFor3rdChar.size() - 1);
                            boolean foundInBetween = false;
                            for (int indexFor2ndChar : listFor2ndChar) {
                                if (indexFor2ndChar > i && indexFor2ndChar < lastIndexFor3rdChar) {
                                    foundInBetween = true;
                                    break;
                                }
                            }
                            if (foundInBetween) {
                                set.add("" + s.charAt(i) + c + s.charAt(i));
                            }
                        }
                    }
                }
            }
            return set.size();
        }
    }
}
