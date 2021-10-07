package com.fishercoder.solutions;

public class _2024 {
    public static class Solution1 {
        public int maxConsecutiveAnswers(String answerKey, int k) {
            int max;
            //change T to F and count number of Fs
            int right = 0;
            int originalK = k;
            while (k > 0 && right < answerKey.length()) {
                if (answerKey.charAt(right) == 'T') {
                    k--;
                }
                right++;
            }
            max = right;
            int left = 0;
            while (right < answerKey.length() && left < answerKey.length()) {
                if (answerKey.charAt(right) == 'F') {
                    right++;
                    max = Math.max(max, right - left);
                } else {
                    while (left < right && answerKey.charAt(left) == 'F') {
                        left++;
                    }
                    left++;
                    right++;
                }
            }

            //change F to T
            right = 0;
            k = originalK;
            while (k > 0 && right < answerKey.length()) {
                if (answerKey.charAt(right) == 'F') {
                    k--;
                }
                right++;
            }
            max = Math.max(max, right);
            left = 0;
            while (right < answerKey.length() && left < answerKey.length()) {
                if (answerKey.charAt(right) == 'T') {
                    right++;
                    max = Math.max(max, right - left);
                } else {
                    while (left < right && answerKey.charAt(left) == 'T') {
                        left++;
                    }
                    left++;
                    right++;
                }
            }
            return max;
        }
    }
}
