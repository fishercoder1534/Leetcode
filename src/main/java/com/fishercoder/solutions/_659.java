package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 659. Split Array into Consecutive Subsequences
 *
 * You are given an integer array sorted in ascending order (may contain duplicates),
 * you need to split them into several subsequences,
 * where each subsequences consist of at least 3 consecutive integers. Return whether you can make such a split.

 Example 1:
 Input: [1,2,3,3,4,5]
 Output: True
 Explanation:
 You can split them into two consecutive subsequences :
 1, 2, 3
 3, 4, 5

 Example 2:
 Input: [1,2,3,3,4,4,5,5]
 Output: True
 Explanation:
 You can split them into two consecutive subsequences :
 1, 2, 3, 4, 5
 3, 4, 5

 Example 3:
 Input: [1,2,3,4,4,5]
 Output: False

 Note:
 The length of the input is in range of [1, 10000]
 */

public class _659 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/99187/java-o-n-time-o-n-space
         */
        public boolean isPossible(int[] nums) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int i : nums) {
                freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
            }
            Map<Integer, Integer> appendFreqMap = new HashMap<>();
            for (int i : nums) {
                if (freqMap.get(i) == 0) {
                    continue;
                } else if (appendFreqMap.getOrDefault(i, 0) > 0) {
                    appendFreqMap.put(i, appendFreqMap.get(i) - 1);
                    appendFreqMap.put(i + 1, appendFreqMap.getOrDefault(i + 1, 0) + 1);
                } else if (freqMap.getOrDefault(i + 1, 0) > 0 && freqMap.getOrDefault(i + 2, 0) > 0) {
                    freqMap.put(i + 1, freqMap.get(i + 1) - 1);
                    freqMap.put(i + 2, freqMap.get(i + 2) - 1);
                    appendFreqMap.put(i + 3, appendFreqMap.getOrDefault(i + 3, 0) + 1);
                } else {
                    return false;
                }
                freqMap.put(i, freqMap.get(i) - 1);
            }
            return true;
        }
    }
}
