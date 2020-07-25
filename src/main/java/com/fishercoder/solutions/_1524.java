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
            int oddSumCount = 0;
            int evenSumCount = 1;
            long result = 0;
            int sum = 0;
            for (int num : arr) {
                sum += num;
                if (sum % 2 == 0) {
                    result += oddSumCount;
                } else {
                    result += evenSumCount;
                }
                if (sum % 2 == 0) {
                    evenSumCount++;
                } else {
                    oddSumCount++;
                }
                result %= 1000000007;
            }
            return (int) result % 1000000007;
        }
    }
}
