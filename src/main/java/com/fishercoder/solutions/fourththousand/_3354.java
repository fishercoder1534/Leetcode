package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3354 {
    public static class Solution1 {
        public int countValidSelections(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    if (isValidWithMoveDirection(nums, i, true)) {
                        count++;
                    }
                    if (isValidWithMoveDirection(nums, i, false)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean isValidWithMoveDirection(int[] nums, int index, boolean moveLeft) {
            int[] copy = Arrays.copyOf(nums, nums.length);
            while (index >= 0 && index < nums.length) {
                if (moveLeft) {
                    if (copy[index] > 0) {
                        copy[index]--;
                        moveLeft = !moveLeft;
                        index++;
                    } else {
                        index--;
                    }
                } else {
                    if (copy[index] > 0) {
                        copy[index]--;
                        moveLeft = !moveLeft;
                        index--;
                    } else {
                        index++;
                    }
                }
            }
            for (int num : copy) {
                if (num != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
