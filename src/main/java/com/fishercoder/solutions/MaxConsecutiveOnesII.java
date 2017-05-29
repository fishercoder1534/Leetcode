package com.fishercoder.solutions;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

 Example 1:

 Input: [1,0,1,1,0]
 Output: 4

 Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 After flipping, the maximum number of consecutive 1s is 4.

 Note:
 The input array will only contain 0 and 1.
 The length of input array is a positive integer and will not exceed 10,000

 Follow up:
 What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?
 */
public class MaxConsecutiveOnesII {
    //TODO: could be optimized to O(1) space
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] numSums = new int[nums.length];
        numSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                numSums[i] = numSums[i-1]+1;
            } else {
                numSums[i] = 0;
            }
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int right = i+1;
                while (right < nums.length && nums[right] != 0) {
                    right++;
                }
                int newMax = (i > 0) ? numSums[i-1] + 1 + numSums[right-1] : 1 + numSums[right-1];
                max = Math.max(max, newMax);
            }
            if (i == 0 && nums[i] == 1) max = 1;
            max = Math.max(max, numSums[i]);
        }
        return max;
    }

}
