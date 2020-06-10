package com.fishercoder.solutions;

import java.util.TreeSet;

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
         * https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html#ceiling(E): Returns the
         * least element in this set greater than or equal to the given element, or null if there is no
         * such element.
         * https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html#floor(E): Returns the
         * greatest element in this set less than or equal to the given element, or null if there is no
         * such element.
         *
         * Idea: loop through this array, keep adding each element into the TreeSet, also keep an eye on
         * the size of the TreeSet, if it's greater than the required distance of k, then we remove the
         * left-most or oldest one from the set. For each element, we get the current floor and the
         * current ceiling and see if it works, if it does, then we return true immediately, otherwise,
         * we continue. Return false when we finished the loop.
         */

        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            /**case to Long to avoid Integer overflow.*/
            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < nums.length; ++i) {
                Long s = set.ceiling((long) nums[i]);
                if (s != null && s - nums[i] <= t) {
                    return true;
                }

                Long g = set.floor((long) nums[i]);
                if (g != null && nums[i] - g <= t) {
                    return true;
                }

                set.add((long) nums[i]);
                if (set.size() > k) {
                    set.remove((long) nums[i - k]);
                }
            }
            return false;
        }
    }
}
