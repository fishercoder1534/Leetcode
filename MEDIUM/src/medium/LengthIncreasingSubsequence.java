package medium;

import utils.CommonUtils;

/**300. Longest Increasing Subsequence  QuestionEditorial Solution  My Submissions
Total Accepted: 38678
Total Submissions: 108774
Difficulty: Medium
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

Credits:
Special thanks to @pbrother for adding this problem and creating all test cases.*/
public class LengthIncreasingSubsequence {
    public static void main(String...strings){
        LengthIncreasingSubsequence test = new LengthIncreasingSubsequence();
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
//        int[] nums = new int[]{10,9,2,5,3,4};
//        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
//        int[] nums = new int[]{18,55,66,2,3,54};
        System.out.println(test.lengthOfLIS(nums));
    }

    /**This is the closest I got, passed all normal cases, made it to 22/23 test cases, but got TLE, as I expected,
     * since this algorithm runs in O(n^3) time.
     * My idea: compute a 2D tabular: n*n.
     * 
     * Then miracle happens, I was about to turn to Discuss, before that, I clicked the Show Tags button, it says:
     * Binary Search, this hints me to take a second look at my code, then I added this line:
     * if(nums.length-i < max) return max;
     * then it got AC'ed!
     * This is the power of pruning! So Cool!
     * 
     * Also, another key was that let j start from i, not 0, we don't need to initialize the bottom left part to 1, just
     * leave them as zero, that's fine, since we don't need to touch that part at all!
     * This also saves time! Cool!
     * */
    public int lengthOfLIS(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int[][] dp = new int[nums.length][nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums.length-i < max) return max;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    for (int k = j - 1; k >= i; k--) {
                        if (nums[k] < nums[j]) {
                            dp[i][j] = Math.max(dp[i][k] + 1, dp[i][j]);
                        }
                    }
                } else
                    dp[i][j] = 1;
                max = Math.max(max, dp[i][j]);
            }
        }
        CommonUtils.printMatrix(dp);
        return max;

    }
    
}
