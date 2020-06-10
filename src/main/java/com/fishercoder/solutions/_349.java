package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _349 {

    public static class Solution1 {
        //credit: https://leetcode.com/articles/intersection-of-two-arrays/
        //Time: O(m+n) on average, O(m*n) in worse case
        //Space: O(m+n)
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            set1.retainAll(set2);
            int[] intersection = new int[set1.size()];
            int i = 0;
            for (int num : set1) {
                intersection[i++] = num;
            }
            return intersection;
        }
    }

    public static class Solution2 {
        //Time: O(nlgn)
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums2);
            Set<Integer> intersect = new HashSet();
            for (int i : nums1) {
                if (binarySearch(i, nums2)) {
                    intersect.add(i);
                }
            }
            int[] result = new int[intersect.size()];
            int i = 0;
            for (int num : intersect) {
                result[i++] = num;
            }
            return result;
        }

        private boolean binarySearch(int i, int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == i) {
                    return true;
                } else if (nums[mid] > i) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return false;
        }
    }

    public static class Solution3 {
        //use two pointers
        //credit: https://leetcode.com/problems/intersection-of-two-arrays/discuss/81969/Three-Java-Solutions
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            Set<Integer> set = new HashSet<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i++]);
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            int[] intersection = new int[set.size()];
            int k = 0;
            for (int num : set) {
                intersection[k++] = num;
            }
            return intersection;
        }
    }
}
