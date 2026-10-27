package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3551 {
    public static class Solution1 {
        public int minSwaps(int[] nums) {
            int n = nums.length;
            int[][] arr = new int[n][3];
            //we store three items in the 2-d array: originalIndex, digitSum, originalValue
            for (int i = 0; i < nums.length; i++) {
                int sum = getDigitSum(nums[i]);
                arr[i][0] = i;
                arr[i][1] = sum;
                arr[i][2] = nums[i];
            }
            //we sort this 2-d array based on its digitSum, if tied, sort by originalValue
            Arrays.sort(arr, (a, b) -> {
                if (a[1] != b[1]) {
                    return a[1] - b[1];
                }
                return a[2] - b[2];
            });

            int swaps = 0;
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                // if it's visited already or its original position is its correct position, then we don't need to swap
                if (visited[i] || i == arr[i][0]) {
                    continue;
                }

                //this is the key to understand this:
                int cycleSize = 0;
                int j = i;
                while (!visited[j]) {
                    visited[j] = true;
                    j = arr[j][0]; // move to its originalIndex position
                    cycleSize++;
                }

                swaps += cycleSize - 1;
            }
            return swaps;
        }

        private int getDigitSum(int num) {
            int sum = 0;
            int tmp = num;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            return sum;
        }
    }
}
