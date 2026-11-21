package com.fishercoder.solutions.fifththousand;

public class _4116 {
    public static class Solution1 {
        public String[] assignUmbrella(int[] rain) {
            int aCount = 0;
            int bCount = 0;
            String[] ans = new String[rain.length];
            for (int i = 0; i < rain.length; i++) {
                if (i + 1 < rain.length) {
                    if (rain[i] == rain[i + 1] && rain[i] == 1 && aCount <= bCount) {
                        ans[i] = "Alice";
                        aCount++;
                    } else if (rain[i] == 1) {
                        ans[i] = "Bob";
                        bCount++;
                    } else {
                        ans[i] = "None";
                    }
                } else if (rain[i] == 1) {
                    ans[i] = "Bob";
                    bCount++;
                } else if (rain[i] == 0) {
                    ans[i] = "None";
                }
            }
            return ans;
        }
    }
}
