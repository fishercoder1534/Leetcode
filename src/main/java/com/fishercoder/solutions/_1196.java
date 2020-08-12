package com.fishercoder.solutions;

import java.util.Arrays;

public class _1196 {
    public static class Solution1 {
        public int maxNumberOfApples(int[] arr) {
            Arrays.sort(arr);
            int sum = 0;
            int i = 0;
            for (; i < arr.length; i++) {
                sum += arr[i];
                if (sum > 5000) {
                    break;
                }
            }
            return i;
        }
    }
}
