package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements that appear twice in this array.

 Could you do it without extra space and in O(n) runtime?

 Example:
 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [2,3]
 */
public class _442 {

    //O(n) space
    //O(n) time
    public List<Integer> findDuplicates_solution1(int[] nums) {
        Set<Integer> set = new HashSet();
        List<Integer> result = new ArrayList();
        for (int i : nums) {
            if (!set.add(i)) {
                result.add(i);
            }
        }
        return result;
    }

    //O(1) space
    //O(n) time
    public List<Integer> findDuplicates_solution2(int[] nums) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return result;
    }

}
