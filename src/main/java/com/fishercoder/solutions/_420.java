package com.fishercoder.solutions;

public class _420 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/63854/o-n-java-solution-by-analyzing-changes-allowed-to-fix-each-condition
         */
        public int strongPasswordChecker(String s) {
            int res = 0;
            int a = 1;
            int A = 1;
            int d = 1;
            char[] carr = s.toCharArray();
            int[] arr = new int[carr.length];

            for (int i = 0; i < arr.length; ) {
                if (Character.isLowerCase(carr[i])) {
                    a = 0;
                }
                if (Character.isUpperCase(carr[i])) {
                    A = 0;
                }
                if (Character.isDigit(carr[i])) {
                    d = 0;
                }

                int j = i;
                while (i < carr.length && carr[i] == carr[j]) {
                    i++;
                }
                arr[j] = i - j;
            }

            int totalMissing = (a + A + d);

            if (arr.length < 6) {
                res += totalMissing + Math.max(0, 6 - (arr.length + totalMissing));
            } else {
                int overLen = Math.max(arr.length - 20, 0);
                int leftOver = 0;
                res += overLen;

                for (int k = 1; k < 3; k++) {
                    for (int i = 0; i < arr.length && overLen > 0; i++) {
                        if (arr[i] < 3 || arr[i] % 3 != (k - 1)) {
                            continue;
                        }
                        arr[i] -= Math.min(overLen, k);
                        overLen -= k;
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 3 && overLen > 0) {
                        int need = arr[i] - 2;
                        arr[i] -= overLen;
                        overLen -= need;
                    }

                    if (arr[i] >= 3) {
                        leftOver += arr[i] / 3;
                    }
                }

                res += Math.max(totalMissing, leftOver);
            }

            return res;
        }
    }
}
