package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 *
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process:
 * Starting with any positive integer,
 * replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example: 19 is a happy number
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class _202 {
    public static class Solution1 {
        public boolean isHappy(int n) {
            if (n == 1) {
                return true;
            }
            Set<Integer> seen = new HashSet();
            seen.add(n);
            int result = 0;
            while (result != 1) {
                result = getResult(n);
                if (seen.contains(result)) {
                    return false;
                }
                seen.add(result);
                n = result;
            }
            return true;
        }

        private Integer getResult(int num) {
            int result = 0;
            while (num != 0) {
                result += (num % 10) * (num % 10);
                num /= 10;
            }
            return result;
        }
    }
}
