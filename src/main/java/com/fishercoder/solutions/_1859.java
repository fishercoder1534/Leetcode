package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1859 {
    public static class Solution1 {
        public String sortSentence(String s) {
            String[] words = s.split(" ");
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            for (String word : words) {
                int key = Integer.parseInt(word.charAt(word.length() - 1) + "");
                treeMap.put(key, word.substring(0, word.length() - 1));
            }
            StringBuilder sb = new StringBuilder();
            for (int key : treeMap.keySet()) {
                sb.append(treeMap.get(key));
                sb.append(" ");
            }
            return sb.substring(0, sb.length() - 1);
        }
    }
}
