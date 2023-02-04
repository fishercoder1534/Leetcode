package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2553 {
    public static class Solution1 {
        public int[] separateDigits(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                List<Integer> thisList = new ArrayList<>();
                while (num != 0) {
                    thisList.add(num % 10);
                    num /= 10;
                }
                for (int i = thisList.size() - 1; i >= 0; i--) {
                    list.add(thisList.get(i));
                }
            }
            int[] result = new int[list.size()];
            int i = 0;
            for (int num : list) {
                result[i++] = num;
            }
            return result;
        }
    }
}
