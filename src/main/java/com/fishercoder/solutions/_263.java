package com.fishercoder.solutions;

/**Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 Note that 1 is typically treated as an ugly number.*/

public class _263 {

    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int[] divisors = new int[]{5, 3, 2};
        for (int divisor : divisors) {
            while (num % divisor == 0) {
                num /= divisor;
            }
        }
        return num == 1;
    }

}
