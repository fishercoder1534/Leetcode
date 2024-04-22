package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

public class _26 {

    public static class Solution1 {
        /**
         * Key: It doesn't matter what you leave beyond the returned length.
         */
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 2/2/2022.
         */
        public int removeDuplicates(int[] nums) {
            int left = 0;
            int right = 1;
            for (; right < nums.length; right++) {
                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;
                }
                if (right < nums.length) {
                    nums[++left] = nums[right];
                }
            }
            CommonUtils.printArray(nums);
            return left + 1;
        }
    }

}
