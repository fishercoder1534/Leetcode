package com.fishercoder.solutions;

import java.util.TreeSet;

/**
 * 220. Contains Duplicate III
 * <p>
 * Given an array of integers, find out whether there are two
 * distinct indices i and j in the array such that the difference between nums[i] and nums[j] is at
 * most t and the difference between i and j is at most k.
 */
public class _220 {

    public static class Solution1 {
        /**
         * TreeSet: per Java doc, is a NavigableSet implementation based on a TreeMap. The elements are ordered
         * using their natural ordering, or by a Comparator provided at set creation time, depending on
         * which constructor is used. This implementation provides guaranteed log(n) time cost for the
         * basic operations (add, remove and contains).
         */

        /**
         * TreeSet turns out to be a super handy data structure for this problem. It implements Set
         * interface and keeps elements in sorted order, plus it has two very handy APIs:
         * <p>
         * https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html#ceiling(E): Returns the
         * least element in this set greater than or equal to the given element, or null if there is no
         * such element.
         * <p>
         * https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html#floor(E): Returns the
         * greatest element in this set less than or equal to the given element, or null if there is no
         * such element.
         * <p>
         * Idea: loop through this array, keep adding each element into the TreeSet, also keep an eye on
         * the size of the TreeSet, if it's greater than the required distance of k, then we remove the
         * left-most or oldest one from the set. For each element, we get the current floor and the
         * current ceiling and see if it works, if it does, then we return true immediately, otherwise,
         * we continue. Return false when we finished the loop.
         */

        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < nums.length; ++i) {
                // Find the successor of current element
                Integer s = set.ceiling(nums[i]);
                if (s != null && s <= nums[i] + t) return true;

                // Find the predecessor of current element
                Integer g = set.floor(nums[i]);
                if (g != null && nums[i] <= g + t) return true;

                set.add(nums[i]);
                if (set.size() > k) {
                    set.remove(nums[i - k]);
                }
            }
            return false;
        }
    }
}
