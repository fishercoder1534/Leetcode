package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15 {
    public static class Solution1 {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);

            List<List<Integer>> result = new ArrayList<>();
            for (int left = 0; left < nums.length - 2; left++) {
                if (left >= 1 && nums[left] == nums[left - 1]) {
                    continue;
                }
                int mid = left + 1;
                int right = nums.length - 1;
                while (mid < right) {
                    int sum = nums[left] + nums[mid] + nums[right];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[left], nums[mid], nums[right]));

                        while (mid < right && nums[mid] == nums[mid + 1]) {
                            mid++;
                        }

                        while (mid < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        // these two lines are critical and easy to forget, if so, it'll TLE
                        mid++;
                        right--;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        mid++;
                    }
                }
            }
            return result;
        }
    }
}
