package com.fishercoder.solutions;

public class _376 {

    public static class Solution1 {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length < 2) {
                return nums.length;
            }
            int prevDiff = nums[1] - nums[0];
            int count = (prevDiff != 0) ? 2 : 1;
            for (int i = 2; i < nums.length; i++) {
                int diff = nums[i] - nums[i - 1];
                /**ATTN: prevDiff could be zero. e.g. [3,3,3,2,5]
                 * but diff needs to exactly greater than zero*/
                if ((prevDiff <= 0 && diff > 0) || (prevDiff >= 0) && diff < 0) {
                    count++;
                    prevDiff = diff;
                }
            }
            return count;
        }
    }
}
