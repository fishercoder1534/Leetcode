package medium;

import java.util.Arrays;

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
    
    public int lengthOfLIS_using_binary_search_from_discuss(int[] nums) {
        /**Java doc for this Arrays.binarySearch method:
         * int java.util.Arrays.binarySearch(int[] a, int fromIndex, int toIndex, int key)

Searches a range of the specified array of ints for the specified value using the binary search algorithm. The range must be sorted (as by the sort(int [], int, int) method) prior to making this call. If it is not sorted, the results are undefined. If the range contains multiple elements with the specified value, there is no guarantee which one will be found.

Parameters:
a the array to be searched
fromIndex the index of the first element (inclusive) to be searched
toIndex the index of the last element (exclusive) to be searched
key the value to be searched for

Returns:
index of the search key, if it is contained in the array within the specified range; otherwise, (-(insertion point) - 1). The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element in the range greater than the key, or toIndex if all elements in the range are less than the specified key. Note that this guarantees that the return value will be >= 0 if and only if the key is found.*/
        int[] dp = new int[nums.length];
        int len = 0;
        for(int x : nums){
            int i = Arrays.binarySearch(dp, 0, len, x);
            System.out.println("i = " + i + "\tx = " + x);
            if(i < 0) i = -(i+1);
            dp[i] = x;
            if(i == len) len++;
        }
        CommonUtils.printArray(nums);
        CommonUtils.printArray(dp);
        return len;
    }
    
    public static void main(String...strings){
        LengthIncreasingSubsequence test = new LengthIncreasingSubsequence();
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
//        int[] nums = new int[]{10,9,2,5,3,4};
//        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
//        int[] nums = new int[]{18,55,66,2,3,54};
//        System.out.println(test.lengthOfLIS(nums));
        System.out.println(test.lengthOfLIS_using_binary_search_from_discuss(nums));
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
