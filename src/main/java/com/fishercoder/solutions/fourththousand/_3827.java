package com.fishercoder.solutions.fourththousand;

public class _3827 {
    public static class Solution1 {
        public int countMonobit(int n) {
            int count = 0;
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    count++;
                } else {
                    String bin = Integer.toBinaryString(i);
                    boolean valid = true;
                    for (char c : bin.toCharArray()) {
                        if (c != '1') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
