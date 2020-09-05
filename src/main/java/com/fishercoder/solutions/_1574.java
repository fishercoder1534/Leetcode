package com.fishercoder.solutions;

public class _1574 {
    public static class Solution1 {
        public int findLengthOfShortestSubarray(int[] arr) {
            int left = 0;
            while (left < arr.length - 1 && arr[left] <= arr[left + 1]) {
                left++;
            }
            if (left == arr.length - 1) {
                return 0;
            }
            int right = arr.length - 1;
            while (right > left && arr[right] >= arr[right - 1]) {
                right--;
            }
            if (right == 0) {
                return arr.length - 1;
            }
            int result = Math.min(arr.length - left - 1, right);
            int i = 0;
            int j = right;
            while (i <= left && j < arr.length) {
                if (arr[j] >= arr[i]) {
                    result = Math.min(result, j - i - 1);
                    i++;
                } else {
                    j++;
                }
            }
            return result;
        }
    }
}
