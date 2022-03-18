package com.fishercoder.solutions;

public class _169 {
    public static class Solution1 {
        /**
         * Moore Voting Algorithm
         * How to understand this:
         * 1. For a number to qualify as a majority element, it needs to occur more than 1/2 times, which
         * means there are a max of only one such element in any given array.
         * 2. E.g. given this array [1,2,3,1,1,1], two of the 1s will be balanced off by 2 and 3, still there are two 1s remaining in the end
         * which is the majority element
         */
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

    public static class Solution3 {
        /**
         * I'm glad to have come up with this idea myself on 10/12/2021.
         */
        public int majorityElement(int[] nums) {
            int count = 1;
            int candidate = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != candidate) {
                    count--;
                    if (count < 0) {
                        candidate = nums[i];
                        count = 1;
                    }
                } else {
                    count++;
                }
            }
            return candidate;
        }
    }
}
