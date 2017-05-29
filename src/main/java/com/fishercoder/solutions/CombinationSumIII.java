package com.fishercoder.solutions;

import java.util.*;

/**Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


 Example 1:

 Input: k = 3, n = 7

 Output:

 [[1,2,4]]

 Example 2:

 Input: k = 3, n = 9

 Output:

 [[1,2,6], [1,3,5], [2,3,4]]*/
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        helper(k, n, nums, 0, new ArrayList(), result);
        return result;
    }

    void helper(int k, int n, int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
        if (n > 0) {
            for (int i = start; i < nums.length; i++) {
                curr.add(nums[i]);
                helper(k, n - nums[i], nums, i + 1, curr, result);// it needs to be a unique set of
                                                                  // numbers, so we need to set it
                                                                  // as i+1 here: each number is
                                                                  // used only once in this array:
                                                                  // [1,2,3,4,5,6,7,8,9]
                curr.remove(curr.size() - 1);
            }
        } else if (n == 0 && curr.size() == k) {//this is the major difference here: check size of curr list is of k before adding it
            List<Integer> temp = new ArrayList(curr);
            result.add(temp);
        }
    }
}
