package com.fishercoder.solutions.thirdthousand;

public class _2960 {
    public static class Solution1 {
        public int countTestedDevices(int[] batteryPercentages) {
            int ans = 0;
            for (int i = 0; i < batteryPercentages.length; i++) {
                if (batteryPercentages[i] > 0) {
                    ans++;
                    for (int j = i + 1; j < batteryPercentages.length; j++) {
                        batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                    }
                }
            }
            return ans;
        }
    }
}
