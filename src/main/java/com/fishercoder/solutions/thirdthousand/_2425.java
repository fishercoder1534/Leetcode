package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;

public class _2425 {
    public static class Solution1 {
        /**
         * Use one example to scratch it out:
         * nums1=[2,1,3]
         * nums2=[10,2,5,0]
         * all pairings will be:
         * (2,10),(2,2),(2,5),(2,0)
         * (1,10),(1,2),(1,5),(1,0)
         * (3,10),(3,2),(3,5),(3,0)
         * <p>
         * You can see for each number in nums1, it'll show up for XOR 4 times, i.e. nums2.length
         * and for each number in nums2, it'll show up for XOR for 3 times, i.e. nums1.length
         * <p>
         * Two notes:
         * 1. when a number XOR with itself even number of times, the result becomes zero;
         * 2. when a number XOR with itself odd number of times, the result becomes itself;
         * 3. when a number XOR with zero, the result is itself;
         *
         */
        public int xorAllNums(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + nums2.length);
            }
            for (int num : nums2) {
                map.put(num, map.getOrDefault(num, 0) + nums1.length);
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 == 1) {
                    ans ^= entry.getKey();
                }
            }
            return ans;
        }
    }
}
