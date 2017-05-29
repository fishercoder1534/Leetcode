package com.fishercoder.solutions;

/**
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

 Example 1:
 Input: [1,1,2,3,3,4,4,8,8]
 Output: 2
 Example 2:
 Input: [3,3,7,7,10,11,11]
 Output: 10
 Note: Your solution should run in O(log n) time and O(1) space.
 */
public class SingleElementinaSortedArray {
//  TODO:  Could be optimized to O(logn) by using binary search
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
