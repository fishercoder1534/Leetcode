package com.fishercoder.solutions;

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
}
