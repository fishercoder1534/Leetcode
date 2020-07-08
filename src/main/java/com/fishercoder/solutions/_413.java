package com.fishercoder.solutions;

public class _413 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/62884/2ms-java-o-n-time-o-1-space-solution
        public int numberOfArithmeticSlices(int[] A) {
            int sum = 0;
            int len = 2;
            for (int i = 2; i < A.length; i++) {
                if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                    len++;
                } else {
                    if (len > 2) {
                        sum += calculateSlices(len);
                    }
                    len = 2;//reset it to 2
                }
            }
            if (len > 2) {
                sum += calculateSlices(len);
            }
            return sum;
        }

        int calculateSlices(int len) {
            return (len - 1) * (len - 2) / 2;
        }
    }

    class Solution2 {
        //credit: https://discuss.leetcode.com/topic/63302/simple-java-solution-9-lines-2ms
        public int numberOfArithmeticSlices(int[] A) {
            int sum = 0;
            int curr = 0;
            for (int i = 2; i < A.length; i++) {
                if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                    curr++;
                    sum += curr;
                } else {
                    curr = 0;
                }
            }
            return sum;
        }
    }

}
