package com.fishercoder.solutions.fourththousand;

public class _3407 {
    public static class Solution1 {
        public boolean hasMatch(String s, String p) {
            int index = p.indexOf('*');
            int firstPos = s.indexOf(p.substring(0, index));
            int secondPos = s.indexOf(p.substring(index + 1), firstPos + index);
            return firstPos != -1 && secondPos != -1;
        }
    }
}
