package com.fishercoder.solutions;

public class _2125 {
    public static class Solution1 {
        public int numberOfBeams(String[] bank) {
            int ans = 0;
            for (int i = 0; i < bank.length; ) {
                String currRow = bank[i];
                if (currRow.indexOf('1') == -1) {
                    i++;
                    continue;
                }
                int num1 = 0;
                for (char c : currRow.toCharArray()) {
                    if (c == '1') {
                        num1++;
                    }
                }
                i++;
                while (i < bank.length) {
                    if (bank[i].indexOf('1') == -1) {
                        i++;
                    } else {
                        break;
                    }
                }
                int num2 = 0;
                if (i >= bank.length) {
                    break;
                } else {
                    for (char c : bank[i].toCharArray()) {
                        if (c == '1') {
                            num2++;
                        }
                    }
                }
                ans += num1 * num2;
            }
            return ans;
        }
    }
}
