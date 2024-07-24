package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2191 {
    public static class Solution1 {
        public int[] sortJumbled(int[] mapping, int[] nums) {
            int[][] result = new int[nums.length][2];
            for (int i = 0; i < nums.length; i++) {
                result[i][0] = convert(nums[i], mapping);
                result[i][1] = i;
            }
            Arrays.sort(result, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            int[] list = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                list[i] = nums[result[i][1]];
            }
            return list;
        }

        private int convert(int num, int[] mapping) {
            char[] charArray = String.valueOf(num).toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                sb.append(mapping[Character.getNumericValue(c)]);
            }
            int i = 0;
            while (i < sb.length() && sb.charAt(i) == '0') {
                i++;
            }
            if (i >= sb.length()) {
                return 0;
            }
            return Integer.parseInt(sb.substring(i));
        }
    }
}
