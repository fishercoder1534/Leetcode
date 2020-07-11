package com.fishercoder.solutions;

public class _434 {

    public static class Solution1 {
        public int countSegments(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
            String[] segments = s.split(" ");
            int count = 0;
            for (String seg : segments) {
                if (seg.equals("")) {
                    continue;
                }
                count++;
            }
            return count;
        }
    }
}
