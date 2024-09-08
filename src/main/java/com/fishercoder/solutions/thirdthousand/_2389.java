package com.fishercoder.solutions.thirdthousand;

import java.util.Map;
import java.util.TreeMap;

public class _2389 {
    public static class Solution1 {
        /*
         * My completely original solution, not sure why it's labeled EASY, IMHO, it should be a soft MEDIUM.
         */
        public int[] answerQueries(int[] nums, int[] queries) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int total = 0;
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                total += num;
            }
            int[] answer = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int sum = total;
                int len = nums.length;
                TreeMap<Integer, Integer> copy = new TreeMap<>(map);
                if (sum <= queries[i]) {
                    answer[i] = len;
                } else {
                    do {
                        sum -= copy.lastKey();
                        len--;
                        if (sum <= queries[i]) {
                            answer[i] = len;
                            break;
                        }
                        Map.Entry<Integer, Integer> lastEntry = copy.pollLastEntry();
                        if (lastEntry.getValue() > 1) {
                            copy.put(lastEntry.getKey(), lastEntry.getValue() - 1);
                        }
                    } while (sum > queries[i]);
                }
            }
            return answer;
        }
    }
}
