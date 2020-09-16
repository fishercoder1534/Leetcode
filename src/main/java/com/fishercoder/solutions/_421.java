package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _421 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/63213/java-o-n-solution-using-bit-manipulation-and-hashmap/7
         * <p>
         * Note: comment out those system.out.println statements before submitting on LeetCode, otherwise TLE.
         */
        public int findMaximumXOR(int[] nums) {
            int max = 0;
            int mask = 0;
            for (int i = 31; i >= 0; i--) {
                mask |= (1 << i);//the mask will grow like this: 100...000, 110...000, 111...000 to 111...111, each time, we only get the most left part of all numbers in the given array
                System.out.println("mask = " + Integer.toBinaryString(mask));
                Set<Integer> set = new HashSet<>();
                for (int num : nums) {
                    System.out.println("num = " + Integer.toBinaryString(num));
                    set.add(num & mask);
                    System.out.println("mask & num = " + Integer.toBinaryString(mask & num));
                }

                int candidate = max | (1 << i);
                System.out.println("candidate = " + Integer.toBinaryString(candidate));
                /**Reason behind this: if a ^ prefix = candidate, then a ^ candidate = prefix, also prefix ^ candidate = a
                 * in this below code: we use this one: prefix ^ candidate = a*/
                for (int prefix : set) {
                    System.out.println("candidate ^ prefix = " + Integer.toBinaryString(candidate ^ prefix));
                    if (set.contains(candidate ^ prefix)) {
                        max = candidate;
                    }
                }
                System.out.println("max = " + max);
                System.out.println("i = " + i);
                System.out.println("===============================================");
            }
            return max;
        }
    }

}
