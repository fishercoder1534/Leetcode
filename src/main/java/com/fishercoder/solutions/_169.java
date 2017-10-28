package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**169. Majority Element
 *
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

*/
public class _169 {
    public static class Solution1 {
//        Moore Voting Algorithm
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
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                if (map.get(i) > nums.length / 2) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class Solution3 {
        //This is O(nlogn) time.
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }

    public static class Solution4 {
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
                bit[i] = bit[i] > nums.length / 2 ? 1 : 0;//we get rid of those that bits that are not part of the majority number
                res += bit[i] * (1 << (31 - i));
            }
            return res;
        }
    }
}
