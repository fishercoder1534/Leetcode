package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1493 {
    public static class Solution1 {
        public int longestSubarray(int[] nums) {
            List<int[]> brackets = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    int right = i + 1;
                    while (right < nums.length && nums[right] == 1) {
                        right++;
                    }
                    if (right < nums.length && nums[right] == 1) {
                        brackets.add(new int[]{i, right});
                    } else {
                        brackets.add(new int[]{i, right - 1});
                    }
                    i = right;
                }
            }
            int longest = 0;
            for (int[] bracket : brackets) {
                if (bracket[1] == nums.length - 1 && bracket[0] == 0) {
                    return nums.length - 1;
                }
                longest = Math.max(bracket[1] - bracket[0] + 1, longest);
            }
            for (int i = 0; i < brackets.size() - 1; i++) {
                int[] first = brackets.get(i);
                int[] second = brackets.get(i + 1);
                if (first[1] + 2 == second[0]) {
                    int connected = (first[1] - first[0] + 1) + (second[1] - second[0] + 1);
                    longest = Math.max(longest, connected);
                }
            }
            return longest;
        }
    }
}
