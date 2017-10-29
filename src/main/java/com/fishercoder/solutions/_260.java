package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 260. Single Number III
 *
 * Given an array of numbers nums,
 * in which exactly two elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/

public class _260 {

    public static class Solution1 {
        public int[] singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            int[] res = new int[2];
            int index = 0;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    res[index++] = key;
                }
                if (index == 2) {
                    break;
                }
            }
            return res;
        }
    }

    public static class Solution2 {
        /**Credit: https://discuss.leetcode.com/topic/21605/accepted-c-java-o-n-time-o-1-space-easy-solution-with-detail-explanations/2
         *
         * some more explanation about this algorithm:
         * two's complement: one number's two's complement number is computed as below:
         * reverse all bits of this number and then add one:
         * e.g. decimal number 2, in binary format: 0010 (4 bits)
         * reversing every single bit becomes 1101,
         * then add 1 to it, it becomes 1110
         *
         * so
         * num &= -num, in this case, 2 &= -2 becomes 2
         * */
        public int[] singleNumber(int[] nums) {
            int diff = 0;
            for (int num : nums) {
                diff ^= num;
            }

            //get least significant set bit
            diff &= -diff;

            int[] result = new int[2];
            for (int num : nums) {
                if ((num & diff) == 0) {
                    result[0] ^= num;
                } else {
                    result[1] ^= num;
                }
            }
            return result;
        }
    }
}
