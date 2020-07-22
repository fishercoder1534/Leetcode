package com.fishercoder.solutions;

public class _739 {

    public static class Solution1 {
        public int[] dailyTemperatures(int[] temperatures) {
            if (temperatures == null || temperatures.length == 0) {
                return temperatures;
            }
            int[] result = new int[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                for (int j = i + 1; j < temperatures.length; j++) {
                    if (temperatures[j] > temperatures[i]) {
                        result[i] = j - i;
                        break;
                    }
                }
            }
            return result;
        }
    }
}
