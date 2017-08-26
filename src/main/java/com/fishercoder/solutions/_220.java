package com.fishercoder.solutions;

import java.util.TreeSet;

/**
 * 220. Contains Duplicate III
 *
 * Given an array of integers, find out whether there are two
 * distinct indices i and j in the array such that the difference between nums[i] and nums[j] is at
 * most t and the difference between i and j is at most k.
 */
public class _220 {
    /**
     * TreeSet: per Java doc, is a NavigableSet implementation based on a TreeMap. The elements are ordered
     * using their natural ordering, or by a Comparator provided at set creation time, depending on
     * which constructor is used. This implementation provides guaranteed log(n) time cost for the
     * basic operations (add, remove and contains).
     */
    
    /**
     * TreeSet turns out to be a super handy data structure for this problem. It implements Set
     * interface and keeps elements in sorted order, plus it has two very handy APIs:
     * 
     * https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html#ceiling(E): Returns the
     * least element in this set greater than or equal to the given element, or null if there is no
     * such element.
     * 
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
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer s = set.ceiling(nums[i]);//take the smallest greater number than nums[i] is there exists
            if (s != null && s - nums[i] <= t) {
                return true;//it must be s - nums[i] here, otherwise, cases like [4,2] 2, 1 wont' pass, because we'll get 2-4 = -2 which is a negative number that for sure will be smaller than t
            }
            Integer g = set.floor(nums[i]);//take the biggest smaller number than nums[i] if there exists
            if (g != null && (long) nums[i] - g <= t) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);//set doesn't have indices and it's not ordered, we could only specify the element
                //that we want to remove, this element is nums[i-k]
            }
        }
        return false;
    }

    /**
     * converting to (long) is essential, otherwise cases like this:
     * <p>
     * [-1,2147483647]
     * <p>
     * 1
     * <p>
     * 2147483647
     * <p>
     * will overflow, i.e. Integer in Java is 32 bit which means Integer.MAX_VALUE =2147483647 and
     * Integer.MIN_VALUE = -2147483648, thus 2147483647 -(-1) = 2147483647+1 =-2147483648 instead of
     * 2147483648 (Java Integer won’t have this number), causing this test case to fail.
     */

    public static void main(String... strings) {
        _220 test = new _220();
        // int[] nums = new int[]{-1, -1};
        // int k = 1;
        // int t = 0;

//        int[] nums = new int[] { 1, 2 };
//        int k = 0;
//        int t = 1;

        int[] nums = new int[]{4, 2};
        int k = 2;
        int t = 1;

        // int[] nums = new int[]{2, 2};
        // int k = 3;
        // int t = 0;

        // int[] nums = new int[]{1};
        // int k = 1;
        // int t = 1;
        System.out.println(test.containsNearbyAlmostDuplicate(nums, k, t));
    }
}
