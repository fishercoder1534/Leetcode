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
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int[][] dp = new int[nums.length][nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int currentMaxForThisRow = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(j <= i) dp[i][j] = 1;
                else {
                    if(nums[j] > nums[i]) {
                        if(nums[j] > currentMaxForThisRow) {
                            dp[i][j] = dp[i][j-1]+1;
                            currentMaxForThisRow = nums[j];
                        } else {
                            dp[i][j] = dp[i][j-1];
                            //in this case, we need to figure out when should we update currentMaxForThisRow? 
                            for(int k = j-1; k >= 0; k--){
                                if(nums[k] < nums[j]){
                                    if(dp[i][k]+1 == dp[i][j] && nums[j-1] > nums[j]){
                                        currentMaxForThisRow = nums[j];
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    else dp[i][j] = dp[i][j-1];
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        CommonUtils.printMatrix(dp);
        return max;
    }
    
    public static void main(String...strings){
        LengthIncreasingSubsequence test = new LengthIncreasingSubsequence();
//        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
//        int[] nums = new int[]{10,9,2,5,3,4};
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        System.out.println(test.lengthOfLIS(nums));
    }
}
