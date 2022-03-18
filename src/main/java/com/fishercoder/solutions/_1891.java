package com.fishercoder.solutions;

import java.util.Arrays;

public class _1891 {
    public static class Solution1 {
        /**
         * My completely original solution on 1/27/2022.
         */
        public int maxLength(int[] ribbons, int k) {
            long sum = 0l;
            int max = ribbons[0];
            for (int num : ribbons) {
                sum += num;
                max = Math.max(max, num);
            }
            if (sum < k) {
                return 0;
            } else if (sum == k) {
                return 1;
            } else {
                Arrays.sort(ribbons);
                int left = 1;
                int right = max;
                int ans = 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    int count = 0;
                    for (int i = ribbons.length - 1; i >= 0; i--) {
                        count += ribbons[i] / mid;
                        if (count >= k) {
                            ans = Math.max(ans, mid);
                            break;
                        }
                    }
                    if (count < k) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                int count = 0;
                for (int i = ribbons.length - 1; i >= 0; i--) {
                    count += ribbons[i] / left;
                    if (count >= k) {
                        ans = Math.max(ans, left);
                        return ans;
                    }
                }
                return ans;
            }
        }
    }
}
