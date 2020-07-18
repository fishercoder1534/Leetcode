package com.fishercoder.solutions;

public class _660 {

    public static class Solution1 {
        public int newInteger(int n) {
            return Integer.parseInt(Integer.toString(n, 9));
        }
    }

    public static class Solution2 {
        public int newInteger(int n) {
            int result = 0;
            int base = 1;
            while (n > 0) {
                result += n % 9 * base;
                n /= 9;
                base *= 10;
            }
            return result;
        }
    }
}
