package com.fishercoder.solutions;

public class _565 {

    public static class Solution1 {
        public int arrayNesting(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            boolean[] visited = new boolean[nums.length];
            int answer = 0;
            for (int i : nums) {
                int count = 0;
                int j = i;
                while (j >= 0 && j < nums.length && !visited[j]) {
                    count++;
                    visited[j] = true;
                    j = nums[j];
                }
                answer = Math.max(answer, count);
            }
            return answer;
        }
    }

}
