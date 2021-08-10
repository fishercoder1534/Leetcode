package com.fishercoder.solutions;

public class _1837 {
    public static class Solution1 {
        public int sumBase(int n, int k) {
            String str = Integer.toString(Integer.parseInt(n + "", 10), k);
            int sum = 0;
            for (char c : str.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            return sum;
        }
    }
}
