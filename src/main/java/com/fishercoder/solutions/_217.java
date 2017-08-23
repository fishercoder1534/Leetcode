package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any
 * duplicates. Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class _217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet();
        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }

    public static void main(String... strings) {
        int[] nums = new int[]{1, 2, 3, 4, 3};
        _217 test = new _217();
        System.out.println(test.containsDuplicate(nums));
    }
}
