package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _330 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/patching-array/ and https://discuss.leetcode.com/topic/35494/solution-explanation/2
         * <p>
         * Let miss be the smallest sum in [0,n] that we might be missing. Meaning we already know we
         * can build all sums in [0,miss). Then if we have a number num <= miss in the given array, we
         * can add it to those smaller sums to build all sums in [0,miss+num). If we don't, then we must
         * add such a number to the array, and it's best to add miss itself, to maximize the reach.
         * <p>
         * Example: Let's say the input is nums = [1, 2, 4, 13, 43] and n = 100. We need to ensure that
         * all sums in the range [1,100] are possible. Using the given numbers 1, 2 and 4, we can
         * already build all sums from 0 to 7, i.e., the range [0,8). But we can't build the sum 8, and
         * the next given number (13) is too large. So we insert 8 into the array. Then we can build all
         * sums in [0,16). Do we need to insert 16 into the array? No! We can already build the sum 3,
         * and adding the given 13 gives us sum 16. We can also add the 13 to the other sums, extending
         * our range to [0,29). And so on. The given 43 is too large to help with sum 29, so we must
         * insert 29 into our array. This extends our range to [0,58). But then the 43 becomes useful
         * and expands our range to [0,101). At which point we're done.
         */

        public int minPatches(int[] nums, int n) {
            long misses = 1;//use long to avoid integer addition overflow
            int patches = 0;
            int i = 0;
            while (misses <= n) {
                if (i < nums.length && nums[i] <= misses) { //miss is covered
                    misses += nums[i++];
                } else { //patch miss to the array
                    misses += misses;
                    patches++;//increase the answer
                }
            }
            return patches;
        }

        public List<Integer> findPatches(int[] nums, int n) {
            long misses = 1;//use long to avoid integer addition overflow
            List<Integer> patches = new ArrayList<>();
            int i = 0;
            while (misses <= n) {
                if (i < nums.length && nums[i] <= misses) { //miss is covered
                    misses += nums[i++];
                } else { //patch miss to the array
                    patches.add((int) misses);//increase the answer
                    misses += misses;
                }
            }
            return patches;
        }
    }

}
