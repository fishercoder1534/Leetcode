package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note: Each element in the result must be unique. The result can be in any order.
 */
public class _349 {

  public static class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set = new HashSet();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i = 0;
      int j = 0;
      for (; i < nums1.length && j < nums2.length; ) {
        if (nums1[i] < nums2[j]) {
          i++;
        } else if (nums1[i] > nums2[j]) {
          j++;
        } else {
          set.add(nums1[i]);
          i++;
          j++;
        }
      }
      int[] result = new int[set.size()];
      Iterator<Integer> it = set.iterator();
      int k = 0;
      while (it.hasNext()) {
        result[k++] = it.next();
      }
      return result;
    }
  }

  public static class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
      //this approach is O(nlgn)
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      Set<Integer> intersect = new HashSet();
      for (int i : nums1) {
        if (binarySearch(i, nums2)) {
          intersect.add(i);
        }
      }
      int[] result = new int[intersect.size()];
      Iterator<Integer> it = intersect.iterator();
      for (int i = 0; i < intersect.size(); i++) {
        result[i] = it.next();
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
}
