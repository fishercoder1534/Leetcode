package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2259 {
    public static class Solution1 {
        public String removeDigit(String number, char digit) {
            StringBuilder sb = new StringBuilder();
            List<String> nums = new ArrayList<>();
            String result = "";
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit) {
                    sb.append(number.substring(0, i));
                    sb.append(number.substring(i + 1));
                    nums.add(sb.toString());
                    sb.setLength(0);
                }
            }
            Collections.sort(nums, Collections.reverseOrder());
            return nums.get(0);
        }
    }
}
