package com.fishercoder.solutions.fourththousand;

public class _3637 {
    public static class Solution1 {
        public boolean isTrionic(int[] nums) {
            for (int p = 1; p < nums.length - 2; p++) {
                boolean validP = true;
                for (int i = 0; i < p; i++) {
                    if (nums[i] >= nums[i + 1]) {
                        validP = false;
                        break;
                    }
                }
                if (validP) {
                    for (int q = p + 1; q < nums.length - 1; q++) {
                        boolean validQ = true;
                        for (int i = p; i < q; i++) {
                            if (nums[i] <= nums[i + 1]) {
                                validQ = false;
                                break;
                            }
                        }

                        if (validQ) {
                            //should be strictly increasing
                            for (int i = q; i < nums.length - 1; i++) {
                                if (nums[i] >= nums[i + 1]) {
                                    validQ = false;
                                    break;
                                }
                            }
                            if (validQ) {
                                return true;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            return false;
        }
    }
}
