package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1980 {
    public static class Solution1 {
        public String findDifferentBinaryString(String[] nums) {
            Set<String> set = new HashSet<>(Arrays.asList(nums));
            int len = nums[0].length();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < len) {
                sb.append(1);
                i++;
            }
            int max = Integer.parseInt(sb.toString(), 2);
            for (int num = 0; num <= max; num++) {
                String binary = Integer.toBinaryString(num);
                if (binary.length() < len) {
                    sb.setLength(0);
                    sb.append(binary);
                    while (sb.length() < len) {
                        sb.insert(0, "0");
                    }
                    binary = sb.toString();
                }
                if (!set.contains(binary)) {
                    return binary;
                }
            }
            return null;
        }
    }
}
