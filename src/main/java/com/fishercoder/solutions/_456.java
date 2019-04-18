package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
/**
 * 456. 132 Pattern
 *
 * Given a sequence of n integers a1, a2, ..., an,
 * a 132 pattern is a subsequence ai, aj, ak such that i < j < k and ai < ak < aj.
 * Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

 Note: n will be less than 15,000.

 Example 1:
 Input: [1, 2, 3, 4]

 Output: False

 Explanation: There is no 132 pattern in the sequence.
 Example 2:
 Input: [3, 1, 4, 2]

 Output: True

 Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
 Example 3:
 Input: [-1, 3, 2, 0]

 Output: True

 Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 */

public class _456 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/67881/single-pass-c-o-n-space-and-time-solution-8-lines-with-detailed-explanation
         * It scans only once, this is the power of using correct data structure.
         * It goes from the right to the left.
         * It keeps pushing elements into the stack,
         * but it also keeps poping elements out of the stack as long as the current element is bigger than this number.
         */
        public boolean find132pattern(int[] nums) {
            Deque<Integer> stack = new LinkedList<>();

            int s3 = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < s3) {
                    return true;
                } else {
                    while (!stack.isEmpty() && nums[i] > stack.peek()) {
                        s3 = Math.max(s3, stack.pop());
                    }
                }
                stack.push(nums[i]);
            }

            return false;
        }
    }

}
