package com.fishercoder.solutions;

public class _507 {

    public static class Solution1 {
        public boolean checkPerfectNumber(int num) {
            if (num == 1) {
                return false;
            }
            int sum = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sum += i;
                    if (i != num / i) {
                        sum += num / i;
                    }
                }
            }
            sum++;
            return sum == num;
        }
    }
}
