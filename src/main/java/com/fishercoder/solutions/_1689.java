package com.fishercoder.solutions;

public class _1689 {
    public static class Solution1 {
        public int minPartitions(String n) {
            int max = 0;
            for (char c : n.toCharArray()) {
                int num = Integer.parseInt(c + "");
                max = Math.max(max, num);
            }
            return max;
        }
    }
}
