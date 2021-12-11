package com.fishercoder.solutions;

import java.util.Arrays;

public class _2099 {
    public static class Solution1 {
        public int[] maxSubsequence(int[] nums, int k) {
            int[][] map = new int[nums.length][2];
            for (int i = 0; i < nums.length; i++) {
                map[i][0] = nums[i];
                map[i][1] = i;
            }
            Arrays.sort(map, (a, b) -> b[0] - a[0]);
            int[][] arr = new int[k][2];
            for (int i = 0; i < k; i++) {
                arr[i][0] = map[i][0];
                arr[i][1] = map[i][1];
            }
            Arrays.sort(arr, (a, b) -> a[1] - b[1]);
            int[] ans = new int[k];
            for (int i = 0; i < k; i++) {
                ans[i] = arr[i][0];
            }
            return ans;
        }
    }
}
