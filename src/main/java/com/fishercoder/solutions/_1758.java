package com.fishercoder.solutions;

public class _1758 {
    public static class Solution1 {
        public int minOperations(String s) {
            int ops1 = 0;
            //start with 0
            boolean isZero = true;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    //should be zero, if not, change it to zero and increase ops1 by one
                    if (s.charAt(i) != '0') {
                        ops1++;
                    }
                } else {
                    //should be one, if not, increase ops1 by one
                    if (s.charAt(i) != '1') {
                        ops1++;
                    }
                }
            }

            //start with 1
            int ops2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    //should be one, if not, increase ops2 by one
                    if (s.charAt(i) != '1') {
                        ops2++;
                    }
                } else {
                    if (s.charAt(i) != '0') {
                        ops2++;
                    }
                }
            }
            return Math.min(ops1, ops2);
        }
    }
}
