package com.fishercoder.solutions.fourththousand;

public class _3411 {
    /**
     * The formula that links GCD and LCM together ({GCD}(a, b) * {LCM}(a, b) = (a * b))
     */
    public static class Solution1 {
        public int maxLength(int[] nums) {
            int n = nums.length;
            int maxLength = 0;
            for (int i = 0; i < nums.length; i++) {
                long prod = 1;
                long gcd = nums[i];
                long lcm = nums[i];
                for (int j = i; j < n; j++) {
                    long num = nums[j];

                    //this is to prevent overflow
                    if (prod > Long.MAX_VALUE / num) {
                        break;
                    }

                    prod *= num;
                    gcd = getGcdIteratively(gcd, num);

                    //compute lcm using the current lcm and num, not gcd
                    lcm = (lcm * num) / getGcdIteratively(lcm, num);

                    if (prod == lcm * gcd) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
            return maxLength;
        }

        private long getGcdIteratively(long a, long b) {
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }
}
