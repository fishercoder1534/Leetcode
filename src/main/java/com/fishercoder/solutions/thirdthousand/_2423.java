package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2423 {
    public static class Solution1 {
        /*
         * This is my original, but unnecessarily verbose solution.
         * Instead, you can just brute force each one of the 26 letters, as long as any one of them makes it meet the requirement, it returns true.
         */
        public boolean equalFrequency(String word) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            Arrays.sort(count);
            return decLast(count) || decFirst(count) || allOnes(count);
        }

        private boolean allOnes(int[] count) {
            for (int i : count) {
                if (i != 1 && i != 0) {
                    return false;
                }
            }
            return true;
        }

        private boolean decFirst(int[] count) {
            int start = 0;
            int firstVal = -1;
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    start = i + 1;
                    firstVal = count[i] - 1;
                    break;
                }
            }
            if (firstVal == 0) {
                int nextVal = count[start++];
                for (; start < 26; start++) {
                    if (count[start] != nextVal) {
                        return false;
                    }
                }
                return true;
            }
            for (; start < 26; start++) {
                if (count[start] != firstVal) {
                    return false;
                }
            }
            return true;
        }

        private boolean decLast(int[] count) {
            int last = count[25] - 1;
            for (int i = 24; i >= 0; i--) {
                if (count[i] != 0 && count[i] != last) {
                    return false;
                }
            }
            return true;
        }
    }
}
