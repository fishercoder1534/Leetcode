package com.fishercoder.solutions;

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
