package com.fishercoder.solutions;

public class _2210 {
    public static class Solution1 {
        public int countHillValley(int[] nums) {
            int ans = 0;
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else if (nums[i] > nums[i - 1]) {
                    int tmp = i;
                    boolean moved = false;
                    while (tmp + 1 < nums.length && nums[tmp] == nums[tmp + 1]) {
                        moved = true;
                        tmp++;
                    }
                    if (moved) {
                        if (tmp + 1 < nums.length && nums[i] > nums[tmp + 1]) {
                            ans++;
                        }
                    } else {
                        if (nums[i] > nums[i + 1]) {
                            ans++;
                        }
                    }
                } else if (nums[i] < nums[i - 1]) {
                    int tmp = i;
                    boolean moved = false;
                    while (tmp + 1 < nums.length && nums[tmp] == nums[tmp + 1]) {
                        moved = true;
                        tmp++;
                    }
                    if (moved) {
                        if (tmp + 1 < nums.length && nums[i] < nums[tmp + 1]) {
                            ans++;
                        }
                    } else {
                        if (nums[i] < nums[i + 1]) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
