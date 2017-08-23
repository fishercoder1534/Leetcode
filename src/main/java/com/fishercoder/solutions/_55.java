package com.fishercoder.solutions;

/**Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.*/
public class _55 {

    public static boolean canJump_greedy(int[] nums) {
        int farthest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= farthest && nums[i] + i > farthest) {
                //i <= farthest is to make sure that this current i is within the current range
                // nums[i]+i > farthest is to make sure that it's necessary to update farthest with current nums[i]+i
                farthest = nums[i] + i;
            }
        }
        return farthest >= nums.length - 1;
    }

    //this normal dp ends in TLE for extreme test cases
    public static boolean canJump_dp(int[] nums) {
        boolean[] can = new boolean[nums.length];
        can[0] = true;
        for (int i = 0; i < nums.length; i++) {
            int reach = nums[i];
            if (can[i]) {
                for (int j = i + 1; j < nums.length && j <= i + reach; j++) {
                    can[j] = true;
                }
            }
        }
        return can[nums.length - 1];
    }

    public static void main(String... strings) {
//        int[] nums = new int[]{1,2};
        int[] nums = new int[]{0, 2, 3};
        System.out.println(canJump_greedy(nums));
    }
}
