package com.fishercoder.solutions;

/**
 * 665. Non-decreasing Array
 *
 *  Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

 We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

 Example 1:

 Input: [4,2,3]
 Output: True
 Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

 Example 2:

 Input: [4,2,1]
 Output: False
 Explanation: You can't get a non-decreasing array by modify at most one element.

 Note: The n belongs to [1, 10,000].
 */
public class _665 {

    public static class Solution1 {
        public boolean checkPossibility(int[] nums) {
            return modifyIMinusOne(nums) || modifyI(nums);
        }

        private boolean modifyI(int[] nums) {
            int[] tmp = nums.clone();
            int len = tmp.length;
            int modifyTimes = 0;
            for (int i = 1; i < len; i++) {
                if (tmp[i] == tmp[i - 1]) {
                    continue;
                }
                if (tmp[i] < tmp[i - 1]) {
                    modifyTimes++;
                    if (modifyTimes > 1) {
                        return false;
                    }
                    tmp[i] = tmp[i - 1];
                }
            }
            for (int i = 1; i < len; i++) {
                if (tmp[i] == tmp[i - 1]) {
                    continue;
                }
                if (tmp[i] < tmp[i - 1]) {
                    return false;
                }
            }
            return true;
        }

        private boolean modifyIMinusOne(int[] nums) {
            int[] tmp = nums.clone();
            int len = tmp.length;
            int modifyTimes = 0;
            for (int i = 1; i < len; i++) {
                if (tmp[i] == tmp[i - 1]) {
                    continue;
                }
                if (tmp[i] < tmp[i - 1]) {
                    modifyTimes++;
                    if (modifyTimes > 1) {
                        return false;
                    }
                    tmp[i - 1] = tmp[i];
                }
            }
            for (int i = 1; i < len; i++) {
                if (tmp[i] == tmp[i - 1]) {
                    continue;
                }
                if (tmp[i] < tmp[i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
