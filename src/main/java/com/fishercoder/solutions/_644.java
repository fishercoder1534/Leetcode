package com.fishercoder.solutions;

public class _644 {
    /**reference: https://leetcode.com/articles/maximum-average-subarray-ii/#approach-2-using-binary-search-accepted
     * https://discuss.leetcode.com/topic/96123/java-solution-o-nlogm-binary-search-the-answer/13*/

    /**
     * To understand the idea behind this method, let's look at the following points.
     * Firstly, we know that the value of the average could lie between the range (min, max)(min,max).
     * Here, minmin and maxmax refer to the minimum and the maximum values out of the given numsnums array.
     * This is because, the average can't be lesser than the minimum value and can't be larger than the maximum value.
     * But, in this case, we need to find the maximum average of a subarray with atleast kk elements.
     * The idea in this method is to try to approximate(guess) the solution and to try to find if this solution really exists.
     * If it exists, we can continue trying to approximate the solution even to a further precise value,
     * but choosing a larger number as the next approximation.
     * But, if the initial guess is wrong, and the initial maximum average value(guessed) isn't possible,
     * we need to try with a smaller number as the next approximate.
     * <p>
     * Now, instead of doing the guesses randomly, we can make use of Binary Search.
     * With minmin and maxmax as the initial numbers to begin with,
     * we can find out the midmid of these two numbers given by (min+max)/2(min+max)/2.
     * Now, we need to find if a subarray with length greater than or equal to kk is possible with an average sum greater than this midmid value.
     */
    public double findMaxAverage(int[] nums, int k) {
        double l = -10000;
        double r = 10000;
        while (r - l > 10e-7) {
            double mid = (l + r) / 2;
            if (getMaxSubbaraySumOfSizeK(nums, k, mid) >= 0) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return (l + r) / 2;
    }

    private double getMaxSubbaraySumOfSizeK(int[] nums, int k, double mid) {
        double sum = 0.0;
        for (int i = 0; i <= k - 1; i++) {
            sum += nums[i] - mid;
        }
        double maxSum = sum;
        double prev = nums[0] - mid;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, Math.max(sum, sum + prev));
            prev = Math.max(nums[i - k + 1], nums[i - k + 1] + prev) - mid;
        }
        return maxSum;
    }
}
