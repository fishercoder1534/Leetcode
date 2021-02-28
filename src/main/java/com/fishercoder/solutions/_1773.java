package com.fishercoder.solutions;

import java.util.List;

public class _1773 {
    public static class Solution1 {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int match = 0;
            for (List<String> item : items) {
                if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                    match++;
                } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                    match++;
                } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                    match++;
                }
            }
            return match;
        }
    }
}
