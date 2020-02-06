package com.fishercoder.solutions;

/**
 * 169. Majority Element

 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty and the majority element always exist in the array.

 Example 1:
 Input: [3,2,3]
 Output: 3

 Example 2:
 Input: [2,2,1,1,1,2,2]
 Output: 2
 */
public class _169 {
  public static class Solution1 {
    /**Moore Voting Algorithm
     * How to understand this:
     * 1. For a number to qualify as a majority element, it needs to occur more than 1/2 times, which
     *          means there are a max of only one such element in any given array.
     * 2. E.g. given this array [1,2,3,1,1,1], two of the 1s will be balanced off by 2 and 3, still there are two 1s remaining in the end
     * which is the majority element*/
    public int majorityElement(int[] nums) {
      int count = 1;
      int majority = nums[0];
      for (int i = 1; i < nums.length; i++) {
        if (count == 0) {
          count++;
          majority = nums[i];
        } else if (nums[i] == majority) {
          count++;
        } else {
          count--;
        }
      }
      return majority;
    }
  }

  public static class Solution2 {
    //bit manipulation
    public int majorityElement(int[] nums) {
      int[] bit = new int[32];//because an integer is 32 bits, so we use an array of 32 long
      for (int num : nums) {
        for (int i = 0; i < 32; i++) {
          if ((num >> (31 - i) & 1) == 1) {
            bit[i]++;//this is to compute each number's ones frequency
          }
        }
      }
      int res = 0;
      //this below for loop is to construct the majority element: since every bit of this element would have appeared more than n/2 times
      for (int i = 0; i < 32; i++) {
        bit[i] = bit[i] > nums.length / 2 ? 1
                : 0;//we get rid of those that bits that are not part of the majority number
        res += bit[i] * (1 << (31 - i));
      }
      return res;
    }
  }
}
