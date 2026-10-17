package com.fishercoder.solutions.fourththousand;

public class _3571 {
    public static class Solution1 {
        public String shortestSuperstring(String s1, String s2) {
            String longer = s1.length() > s2.length() ? s1 : s2;
            String shorter = longer.equals(s1) ? s2 : s1;
            if (longer.indexOf(shorter) != -1) {
                return longer;
            }
            //find the longest prefix of s1 that matches the longest suffix of s2
            String candidate = "";
            for (int i = s1.length(); i > 0; i--) {
                String prefix = s1.substring(0, i);
                for (int j = 0; j < s2.length(); j++) {
                    String suffix = s2.substring(j);
                    if (prefix.equals(suffix)) {
                        candidate = s2 + s1.substring(i);
                        break;
                    }
                }
                if (!candidate.isEmpty()) {
                    break;
                }
            }

            //then do the other way:
            for (int i = s2.length(); i > 0; i--) {
                String prefix = s2.substring(0, i);
                for (int j = 0; j < s1.length(); j++) {
                    String suffix = s1.substring(j);
                    if (prefix.equals(suffix)) {
                        String candidate2 = s1 + s2.substring(i);
                        if (candidate.isEmpty()) {
                            return candidate2;
                        }
                        if (candidate2.length() < candidate.length()) {
                            return candidate2;
                        } else {
                            return candidate;
                        }
                    }
                }
            }
            return candidate.isEmpty() ? s1 + s2 : candidate;
        }
    }
}
