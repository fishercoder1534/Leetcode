package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _922 {
    public static class Solution1 {
        /**
         * Space: O(n)
         * Time: O(n)
         */
        public int[] sortArrayByParityII(int[] nums) {
            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    evens.add(nums[i]);
                } else {
                    odds.add(nums[i]);
                }
            }
            int oddIndex = 0;
            int evenIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    nums[i] = evens.get(evenIndex++);
                } else {
                    nums[i] = odds.get(oddIndex++);
                }
            }
            return nums;
        }
    }

    public static class Solution2 {
        /**
         * Space: O(1)
         * Time: O(n^2)
         */
        public int[] sortArrayByParityII(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0 && nums[i] % 2 != 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (j % 2 != 0 && nums[j] % 2 == 0) {
                            int tmp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = tmp;
                            break;
                        }
                    }
                } else if (i % 2 != 0 && nums[i] % 2 == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (j % 2 == 0 && nums[j] % 2 != 0) {
                            int tmp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = tmp;
                            break;
                        }
                    }
                }
            }
            return nums;
        }
    }

    public static class Solution3 {
        /**
         * This is the most efficient solution: one implicit condition is that:
         * we start with index zero for i, so we look for nums[i] that is not an even number to be swapped with;
         * we start with index one for j, so we look for nums[j] that is not an odd number to be swapped with.
         * Time: O(n)
         * Space: O(1)
         */
        public int[] sortArrayByParityII(int[] nums) {
            for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; ) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i += 2;
                    j += 2;
                }
                while (i < nums.length - 1 && nums[i] % 2 == 0) {
                    i += 2;
                }
                while (j < nums.length && nums[j] % 2 != 0) {
                    j += 2;
                }
            }
            return nums;
        }
    }
}
