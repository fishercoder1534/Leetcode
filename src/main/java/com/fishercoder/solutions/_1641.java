package com.fishercoder.solutions;

import java.util.Arrays;

public class _1641 {
    public static class Solution1 {
        /**
         * I solved this problem using Math, no DP, recursion or backtracking techniques.
         * Time: beat 100% submission consistently since it's O(n), essentialy it's O(1) because the contraints in the problem state: 1 <= n <= 50
         * After writing out from n = 1 to 3, we can see the pattern.
         * Detailed reasoning to be seen in my youtube video on my channel: https://www.youtube.com/fishercoder.
         */
        public int countVowelStrings(int n) {
            if (n == 1) {
                return 5;
            }
            int[] arr = new int[]{1, 1, 1, 1, 1};
            int sum = 5;
            for (int i = 2; i <= n; i++) {
                int[] copy = new int[5];
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0) {
                        copy[j] = sum;
                    } else {
                        copy[j] = copy[j - 1] - arr[j - 1];
                    }
                }
                arr = Arrays.copyOf(copy, 5);
                sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                }
            }
            return sum;
        }
    }
}
