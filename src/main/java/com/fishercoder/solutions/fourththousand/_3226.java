package com.fishercoder.solutions.fourththousand;

public class _3226 {
    public static class Solution1 {
        public int minChanges(int n, int k) {
            if (n == k) {
                return 0;
            }
            String nBin = Integer.toBinaryString(n);
            String kBin = Integer.toBinaryString(k);
            if (nBin.length() > kBin.length()) {
                StringBuilder sb = new StringBuilder(kBin);
                sb.reverse();
                while (nBin.length() > sb.length()) {
                    sb.append("0");
                }
                kBin = sb.reverse().toString();
            }
            if (nBin.length() != kBin.length()) {
                return -1;
            }
            int minChanges = 0;
            for (int i = nBin.length() - 1; i >= 0; i--) {
                if (nBin.charAt(i) != kBin.charAt(i)) {
                    if (nBin.charAt(i) == '1') {
                        minChanges++;
                    } else {
                        return -1;
                    }
                }
            }
            return minChanges;
        }
    }
}
