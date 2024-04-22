package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _442 {

    public static class Solution1 {
        //O(n) space
        //O(n) time
        public List<Integer> findDuplicates(int[] nums) {
            Set<Integer> set = new HashSet();
            List<Integer> result = new ArrayList();
            for (int i : nums) {
                if (!set.add(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * O(1) space
         * O(n) time
         * <p>
         * This approach makes full use of what the problem states: all the integers of nums are in the range [1, n],
         * this implies that for any value x in this array, x - 1 must be a valid index in this array
         * thus, nums[x - 1] is a valid element in this array.
         * <p>
         * So the solution was born:
         * we could mark one element as seen/visited before by negating it,
         * so when we encounter this same number again, i.e. the number is negative,
         * we know it appeared before, so we add it to the result
         * and then negate this number back.
         */
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] < 0) {
                    result.add(Math.abs(index + 1));
                }
                nums[index] = -nums[index];
            }
            return result;
        }
    }

}
