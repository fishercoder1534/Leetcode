package com.fishercoder.solutions.thirdthousand;

public class _2515 {
    public static class Solution1 {
        public int closetTarget(String[] words, String target, int startIndex) {
            int ans = words.length;
            if (words[startIndex].equals(target)) {
                return 0;
            }
            // move forward
            int forwardSteps = 1;
            for (int i = (startIndex + 1) % words.length;
                    i != startIndex;
                    i = ((i + 1) % words.length)) {
                if (words[i].equals(target)) {
                    ans = Math.min(ans, forwardSteps);
                    break;
                }
                forwardSteps++;
            }
            // move backward
            int backwardSteps = 1;
            for (int i = (startIndex - 1 + words.length) % words.length;
                    i != startIndex;
                    i = ((i - 1 + words.length) % words.length)) {
                if (words[i].equals(target)) {
                    ans = Math.min(ans, backwardSteps);
                    break;
                }
                backwardSteps++;
            }
            return ans == words.length ? -1 : ans;
        }
    }
}
