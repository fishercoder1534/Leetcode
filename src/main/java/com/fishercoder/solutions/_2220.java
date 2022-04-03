package com.fishercoder.solutions;

public class _2220 {
    public static class Solution1 {
        public int minBitFlips(int start, int goal) {
            String sBin = Integer.toBinaryString(start);
            String s = String.format("%32s", sBin).replaceAll(" ", "0");
            String gBin = Integer.toBinaryString(goal);
            String g = String.format("%32s", gBin).replaceAll(" ", "0");
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != g.charAt(i)) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
