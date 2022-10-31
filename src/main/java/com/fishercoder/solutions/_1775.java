package com.fishercoder.solutions;

import java.util.Arrays;

public class _1775 {
    public static class Solution1 {
        public int minOperations(int[] nums1, int[] nums2) {
            int[] longer = nums1.length > nums2.length ? nums1 : nums2;
            int[] shorter = nums1.length > nums2.length ? nums2 : nums1;
            if (longer.length > shorter.length * 6) {
                /**This is the impossible case that we'll rule out first.*/
                return -1;
            }
            Arrays.sort(longer);
            Arrays.sort(shorter);
            int i = 0;
            int j = 0;
            int diff = 0;
            while (i < longer.length || j < shorter.length) {
                if (i < longer.length) {
                    diff += longer[i++];
                }
                if (j < shorter.length) {
                    diff -= shorter[j++];
                }
            }
            int minOps = 0;
            i = 0;
            j = shorter.length - 1;
            if (diff < 0) {
                /**if diff is negative, this means we'll need to decrease numbers in the shorter array and increase the numbers in the longer array to make the diff to be zero
                 * and each time, we'll be greedy: take the bigger delta from two of the arrays.*/
                while (diff < 0) {
                    if (i < longer.length && j >= 0) {
                        if (6 - longer[i] < shorter[j] - 1) {
                            diff += shorter[j--] - 1;
                        } else {
                            diff += 6 - longer[i++];
                        }
                    } else if (i < longer.length) {
                        diff += 6 - longer[i++];
                    } else {
                        diff += shorter[j--] - 1;
                    }
                    minOps++;
                }
                return minOps;
            } else if (diff > 0) {
                /**if diff is positive, this means we'll need to decrease the numbers in the longer array and increase the numbers in the shorter array to make the diff to be zero
                 * and each time, we'll be greedy: take the bigger delta from two of the arrays.*/
                i = longer.length - 1;
                j = 0;
                while (diff > 0) {
                    if (i >= 0 && j < shorter.length) {
                        if (longer[i] - 1 > 6 - shorter[j]) {
                            diff -= longer[i--] - 1;
                        } else {
                            diff -= 6 - shorter[j++];
                        }
                    } else if (i >= 0) {
                        diff -= longer[i--] - 1;
                    } else {
                        diff -= 6 - shorter[j++];
                    }
                    minOps++;
                }
                return minOps;
            } else {
                return minOps;
            }
        }
    }
}
