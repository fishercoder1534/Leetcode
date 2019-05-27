package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. Relative Ranks
 *
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.

 Note:
 N is a positive integer and won't exceed 10,000.
 All the scores of athletes are guaranteed to be unique.
 */
public class _506 {

    public static class Solution1 {
        public String[] findRelativeRanks(int[] nums) {
            int[] tmp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                tmp[i] = nums[i];
            }
            Arrays.sort(tmp);
            Map<Integer, String> rankMap = new HashMap();
            int len = nums.length;
            for (int i = len - 1; i >= 0; i--) {
                if (i == len - 1) {
                    rankMap.put(tmp[i], "Gold Medal");
                } else if (i == len - 2) {
                    rankMap.put(tmp[i], "Silver Medal");
                } else if (i == len - 3) {
                    rankMap.put(tmp[i], "Bronze Medal");
                } else {
                    rankMap.put(tmp[i], String.valueOf(len - i));
                }
            }
            String[] result = new String[len];
            for (int i = 0; i < len; i++) {
                result[i] = rankMap.get(nums[i]);
            }
            return result;
        }
    }

}
