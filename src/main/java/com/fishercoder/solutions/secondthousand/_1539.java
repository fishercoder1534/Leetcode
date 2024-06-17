package com.fishercoder.solutions.secondthousand;

import java.util.HashSet;
import java.util.Set;

public class _1539 {
    public static class Solution1 {
        /**
         * Space: O(n)
         * Time: O(n)
         */
        public int findKthPositive(int[] arr, int k) {
            Set<Integer> set = new HashSet<>();
            int max = 0;
            for (int i : arr) {
                set.add(i);
                max = Math.max(max, i);
            }
            int missed = 0;
            for (int i = 1; i <= max; i++) {
                if (!set.contains(i)) {
                    missed++;
                }
                if (missed == k) {
                    return i;
                }
            }
            while (missed++ < k) {
                max++;
            }
            return max;
        }
    }

    public static class Solution2 {
        /**
         * Space: O(1)
         * Time: O(n)
         */
        public int findKthPositive(int[] arr, int k) {
            int missed = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    missed += arr[0] - 1;
                    if (missed >= k) {
                        return k;
                    }
                } else {
                    missed += arr[i] - arr[i - 1] - 1;
                    if (missed >= k) {
                        missed -= arr[i] - arr[i - 1] - 1;
                        int result = arr[i - 1];
                        while (missed++ < k) {
                            result++;
                        }
                        return result;
                    }
                }
            }
            int result = arr[arr.length - 1];
            while (missed++ < k) {
                result++;
            }
            return result;
        }
    }

    public static class Solution3 {
        /**
         * Use binary search:
         * use an array without missing integers to illustrate:
         * 1, 2, 3, 4, 5
         * 2, 3, 4, 7, 11
         * at index = 2, number of missing positive numbers: arr[index] - index - 1
         * <p>
         * Space: O(1)
         * Time: O(logn)
         * Credit: https://leetcode.com/problems/kth-missing-positive-number/editorial/
         */
        public int findKthPositive(int[] arr, int k) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] - mid - 1 < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            //when it exits the above while loop, left = right + 1;
            //the k-th missing number should be between arr[right] and arr[left]
            //the number of integers missing before arr[right] is arr[right] - right - 1;
            //so the number to return is:
            //arr[right] + k - (arr[right] - right - 1) = k + right + 1 = k + left;
            return left + k;
        }
    }
}
