package com.fishercoder.solutions;

public class _1790 {
    public static class Solution1 {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)) {
                return true;
            }
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < i; j++) {
                    String newS1 = swap(s1, i, j);
                    if (newS1.equals(s2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private String swap(String str, int i, int j) {
            char c = str.charAt(i);
            StringBuilder sb = new StringBuilder(str);
            sb.replace(i, i + 1, str.charAt(j) + "");
            sb.replace(j, j + 1, "" + c);
            return sb.toString();
        }
    }
}
