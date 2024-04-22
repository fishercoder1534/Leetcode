package com.fishercoder.solutions;

public class _2120 {
    public static class Solution1 {
        public int[] executeInstructions(int n, int[] startPos, String s) {
            int[] ans = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                int y = startPos[1];
                int x = startPos[0];
                int j = i;
                boolean broken = false;
                for (; j < s.length(); j++) {
                    if (s.charAt(j) == 'R') {
                        if (y + 1 < n) {
                            y++;
                        } else {
                            ans[i] = j - i;
                            broken = true;
                            break;
                        }
                    } else if (s.charAt(j) == 'L') {
                        if (y - 1 >= 0) {
                            y--;
                        } else {
                            ans[i] = j - i;
                            broken = true;
                            break;
                        }
                    } else if (s.charAt(j) == 'U') {
                        if (x - 1 >= 0) {
                            x--;
                        } else {
                            ans[i] = j - i;
                            broken = true;
                            break;
                        }
                    } else if (s.charAt(j) == 'D') {
                        if (x + 1 < n) {
                            x++;
                        } else {
                            ans[i] = j - i;
                            broken = true;
                            break;
                        }
                    }
                }
                if (!broken) {
                    ans[i] = j - i;
                }
            }
            return ans;
        }
    }
}
