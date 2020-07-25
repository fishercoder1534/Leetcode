package com.fishercoder.solutions;

public class _1524 {
    public static class Solution1 {
        /**
         * This brute force solution will throw exceed time limit exceeded exception on LeetCode.
         */
        public int numOfSubarrays(int[] arr) {
            long oddCount = 0;
            for (int i = 0; i < arr.length; i++) {
                long subTotal = 0;
                for (int j = i; j < arr.length; j++) {
                    subTotal += arr[j];
                    if (subTotal % 2 != 0) {
                        oddCount++;
                    }
                }
            }
            return (int) oddCount % 1000000007;
        }
    }

    public static class Solution2 {
        public int numOfSubarrays(int[] arr) {
            int odd = 0;
            int even = 1;
            long count = 0;
            int sum = 0;
            for (int num : arr) {
                sum += num;
                if (sum % 2 == 0) {
                    count += odd;
                } else {
                    count += even;
                }
                if (sum % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                count %= 1000000007;
            }
            return (int) count % 1000000007;
        }
    }
}
