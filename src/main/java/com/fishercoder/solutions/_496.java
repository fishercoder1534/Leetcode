package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _496 {

    public static class Solution1 {
        public int[] nextGreaterElement(int[] findNums, int[] nums) {
            Stack<Integer> stack = new Stack();
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    map.put(stack.pop(), nums[i]);
                }
                stack.push(nums[i]);
            }

            while (!stack.isEmpty()) {
                map.put(stack.pop(), -1);
            }

            int[] result = new int[findNums.length];
            for (int i = 0; i < findNums.length; i++) {
                result[i] = map.get(findNums[i]);
            }
            return result;
        }
    }

}
