package com.fishercoder.solutions;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class _496 {

    public static class Solution1 {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans = new int[nums1.length];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                map.put(nums2[i], i);
            }
            for (int i = 0; i < nums1.length; i++) {
                int start = map.get(nums1[i]);
                for (int j = start + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        ans[i] = nums2[j];
                        break;
                    }
                }
                if (ans[i] == 0) {
                    ans[i] = -1;
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /**
         * Use monotonic stack, using a pen and paper to help visualize this is a great help!
         */
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Deque<Integer> stack = new LinkedList<>();
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums2.length; i++) {
                while (!stack.isEmpty() && nums2[i] > stack.peekLast()) {
                    map.put(stack.pollLast(), nums2[i]);
                }
                stack.addLast(nums2[i]);
            }

            while (!stack.isEmpty()) {
                map.put(stack.pollLast(), -1);
            }

            int[] result = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                result[i] = map.get(nums1[i]);
            }
            return result;
        }
    }

}
