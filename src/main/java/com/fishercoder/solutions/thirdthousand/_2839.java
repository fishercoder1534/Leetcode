package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2839 {
    public static class Solution1 {
        /**
         * Only a total of 6 possibilities, try them all.
         */
        public boolean canBeEqual(String s1, String s2) {
            if (s1.equals(s2)) {
                return true;
            }
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            for (int i = 0; i < 2; i++) {
                swap(c1, i);
                if (Arrays.equals(c1, c2)) {
                    return true;
                }
            }
            c1 = s1.toCharArray();
            c2 = s2.toCharArray();
            //swap only (1,3) for c1 now
            swap(c1, 1);
            if (Arrays.equals(c1, c2)) {
                return true;
            }

            c1 = s1.toCharArray();
            c2 = s2.toCharArray();
            for (int i = 0; i < 2; i++) {
                swap(c2, i);
                if (Arrays.equals(c1, c2)) {
                    return true;
                }
            }
            c1 = s1.toCharArray();
            c2 = s2.toCharArray();
            //swap only (1,3) for c2 now
            swap(c2, 1);
            if (Arrays.equals(c1, c2)) {
                return true;
            }
            return false;
        }

        private void swap(char[] c, int i) {
            char tmp = c[i];
            c[i] = c[i + 2];
            c[i + 2] = tmp;
        }
    }
}
