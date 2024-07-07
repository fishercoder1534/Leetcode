package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3211 {
    public static class Solution1 {
        public List<String> validStrings(int n) {
            List<String> result = new ArrayList<>();
            for (int i = n / 2; i <= n; i++) {
                List<String> combinations = generateCombinations(i, n - i);
                for (String s : combinations) {
                    if (noAdjacentZeroes(s)) {
                        result.add(s);
                    }
                }
            }
            return result;
        }

        private boolean noAdjacentZeroes(String s) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                    return false;
                }
            }
            return true;
        }

        private List<String> generateCombinations(int ones, int zeroes) {
            int[] nums = new int[ones + zeroes];
            int i = 0;
            while (ones-- > 0) {
                nums[i++] = 1;
            }
            return permuteUnique(nums);
        }

        private List<String> permuteUnique(int[] nums) {
            Set<String> set = new HashSet<>();
            set.add("");
            set = recurse(nums, set, 0);
            List<String> list = new ArrayList<>();
            for (String s : set) {
                list.add(s);
            }
            return list;
        }

        private Set<String> recurse(int[] nums, Set<String> set, int pos) {
            if (pos == nums.length) {
                return set;
            }
            Set<String> newSet = new HashSet<>();
            for (String s : set) {
                for (int i = 0; i <= s.length(); i++) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(i, nums[pos]);
                    newSet.add(sb.toString());
                }
            }
            return recurse(nums, newSet, pos + 1);
        }
    }
}
