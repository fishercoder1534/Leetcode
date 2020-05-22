package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _229 {

    public static class Solution1 {
        /**
         * Moore Voting algorithm:
         * This is an extension of Majority Element I, instead of one one majority, there could be a max of two majority elements,
         * so we'll just use two counters to do the job.
         */
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> result = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return result;
            }
            int count1 = 0;
            int count2 = 0;
            int candidate1 = 0;
            int candidate2 = 1;
            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                } else if (num == candidate2) {
                    count2++;
                } else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                } else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }
            count1 = 0;
            count2 = 0;
            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                } else if (num == candidate2) {
                    count2++;
                }
            }
            if (count1 > nums.length / 3) {
                result.add(candidate1);
            }
            if (count2 > nums.length / 3) {
                result.add(candidate2);
            }
            return result;
        }
    }

}
