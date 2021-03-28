package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1805 {
    public static class Solution1 {
        public int numDifferentIntegers(String word) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isDigit(word.charAt(i))) {
                    sb.append(" ");
                } else {
                    sb.append(word.charAt(i));
                }
            }
            String[] numbers = sb.toString().split("\\s+");
            Set<String> set = new HashSet<>();
            for (String num : numbers) {
                if (!num.isEmpty()) {
                    set.add(num.replaceFirst("^0+(?!$)", ""));
                }
            }
            return set.size();
        }
    }
}
