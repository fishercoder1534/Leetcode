package chapter4_DynamicProgrammingI;

public class LongestIncreasingSubsequence {

    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public static int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = (dp[j]+1 > dp[i]) ? dp[j]+1 : dp[i];
                }
            }
            if(dp[i] > max) max = dp[i];
        }
        
        return max;
    }

    public static void main(String...args){
        int[] nums = new int[]{9,3,6,2,7};
        System.out.println(longestIncreasingSubsequence(nums));
    }
}
