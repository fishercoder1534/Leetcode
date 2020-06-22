package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _137 {

    public static class Solution1 {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) != 3) {
                    return key;
                }
            }
            return 0;
        }
    }

    public static class Solution2 {
        /**
         * Credit: https://discuss.leetcode.com/topic/11877/detailed-explanation-and-generalization-of-the-bitwise-operation-method-for-single-numbers/2
         */
        public int singleNumber(int[] nums) {
            int counter1 = 0;
            int counter2 = 0;
            int mask = 0;
            for (int num : nums) {
                counter2 ^= counter1 & num;
                counter1 ^= num;
                mask = ~(counter1 & counter2);
                counter1 &= mask;
                counter2 &= mask;
            }
            return counter1;
        }
    }
}
