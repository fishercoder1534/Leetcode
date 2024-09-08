package com.fishercoder.solutions.thirdthousand;

public class _2748 {
    public static class Solution1 {
        public int countBeautifulPairs(int[] nums) {
            int pairs = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    String iStr = String.valueOf(nums[i]);
                    String jStr = String.valueOf(nums[j]);
                    if (gcd(
                                    Integer.parseInt(iStr.charAt(0) + ""),
                                    Integer.parseInt(jStr.charAt(jStr.length() - 1) + ""))
                            == 1) {
                        pairs++;
                    }
                }
            }
            return pairs;
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }
}
