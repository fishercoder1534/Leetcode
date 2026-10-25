package com.fishercoder.solutions.fifththousand;

public class _4090 {
    public static class Solution1 {
        public long countMagicalPairs(String s) {
            int n = s.length();
            if (n < 2) {
                return 0;
            }
            long total = 0;
            int alpha = 26;
            for (int l = 1; l <= alpha; l++) {
                int[] left = new int[n];
                int[] right = new int[n];

                //moving forward for the left
                int[] freq1 = new int[alpha];
                int[] freq2 = new int[alpha];
                int uniq1 = 0;
                int uniq2 = 0;
                int left1 = 0;
                int left2 = 0;

                for (int j = 0; j < n; j++) {
                    int charIndex = s.charAt(j) - 'a';

                    if (freq1[charIndex]++ == 0) {
                        uniq1++;
                    }

                    while (uniq1 > l) {
                        int removeIndex = s.charAt(left1++) - 'a';
                        if (--freq1[removeIndex] == 0) {
                            uniq1--;
                        }
                    }

                    if (freq2[charIndex]++ == 0) {
                        uniq2++;
                    }

                    while (uniq2 > l - 1) {
                        int removeIndex = s.charAt(left2++) - 'a';
                        if (--freq2[removeIndex] == 0) {
                            uniq2--;
                        }
                    }

                    left[j] = left2 - left1;
                }

                //now for the right side, move it to the left
                int[] freq3 = new int[alpha];
                int[] freq4 = new int[alpha];
                int uniq3 = 0;
                int uniq4 = 0;
                int right1 = n - 1;
                int right2 = n - 1;

                for (int start = n - 1; start >= 0; start--) {
                    int charIndex = s.charAt(start) - 'a';

                    if (freq3[charIndex]++ == 0) {
                        uniq3++;
                    }

                    while (uniq3 > l) {
                        int removeIndex = s.charAt(right1--) - 'a';
                        if (--freq3[removeIndex] == 0) {
                            uniq3--;
                        }
                    }

                    if (freq4[charIndex]++ == 0) {
                        uniq4++;
                    }
                    while (uniq4 > l - 1) {
                        int removeIndex = s.charAt(right2--) - 'a';
                        if (--freq4[removeIndex] == 0) {
                            uniq4--;
                        }
                    }
                    right[start] = right1 - right2;
                }
                for (int j = 0; j < n - 1; j++) {
                    total += (long) left[j] * right[j + 1];
                }
            }
            return total;
        }
    }
}
