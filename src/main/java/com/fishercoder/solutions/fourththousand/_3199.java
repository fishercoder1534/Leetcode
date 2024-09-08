package com.fishercoder.solutions.fourththousand;

public class _3199 {
    public static class Solution1 {
        public int tripletCount(int[] a, int[] b, int[] c) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    for (int k = 0; k < c.length; k++) {
                        int xor = a[i] ^ b[j] ^ c[k];
                        if (evenSetBits(xor)) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }

        private boolean evenSetBits(int num) {
            int bits = 0;
            // this is the idea of calculating hamming weight:
            // https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/firstthousand/_191.java#L16_L23
            while (num != 0) {
                bits++;
                num &= num - 1;
            }
            return bits % 2 == 0;
        }
    }
}
