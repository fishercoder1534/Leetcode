package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _625 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/92854/java-solution-result-array
         * and https://leetcode.com/articles/minimum-factorization/#approach-3-using-factorizationaccepted
         */
        public int smallestFactorization(int a) {
            //case 1: a < 10
            if (a < 10) {
                return a;
            }

            //case 2: start with 9 and try every possible digit
            List<Integer> resultArray = new ArrayList<>();
            for (int i = 9; i > 1; i--) {
                //if current digit divides a, then store all occurences of current digit in res
                while (a % i == 0) {
                    a = a / i;
                    resultArray.add(i);
                }
            }

            //if a could not be broken in form of digits, return 0
            if (a != 0) {
                return 0;
            }

            //get the result from the result array in reverse order
            long result = 0;
            for (int i = resultArray.size() - 1; i >= 0; i--) {
                result = result * 10 + resultArray.get(i);
                if (result > Integer.MAX_VALUE) {
                    return 0;
                }
            }
            return (int) result;
        }
    }

}
