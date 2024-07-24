package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2578 {
    public static class Solution1 {
        public int splitNum(int num) {
            List<Integer> digits = new ArrayList<>();
            while (num != 0) {
                digits.add(num % 10);
                num /= 10;
            }
            Collections.sort(digits);
            StringBuilder nums1 = new StringBuilder();
            StringBuilder nums2 = new StringBuilder();
            for (int i = 0; i < digits.size(); i++) {
                if (nums1.length() < nums2.length()) {
                    nums1.append(digits.get(i));
                } else {
                    nums2.append(digits.get(i));
                }
            }
            return Integer.parseInt(nums1.toString()) + Integer.parseInt(nums2.toString());
        }
    }
}
