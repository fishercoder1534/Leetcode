package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _763 {

    public static class Solution1 {
        public List<Integer> partitionLabels(String s) {
            List<Integer> result = new ArrayList<>();
            int[] last = new int[26];
            /**This is the key step:
             * we find the last occurrence of each letter and record them in last[]*/
            for (int i = 0; i < s.length(); i++) {
                last[s.charAt(i) - 'a'] = i;
            }
            /**record the last end index of the current substring*/
            int end = 0;
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                end = Math.max(end, last[s.charAt(i) - 'a']);
                if (end == i) {
                    result.add(end - start + 1);
                    start = end + 1;
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/14/2021.
         *
         * Again, using a pen and paper to visualize how this works,
         * from the left to the right of the given string helps
         * sort out the algorithm greatly and clears up any ambiguities!
         */
        public List<Integer> partitionLabels(String s) {
            List<Integer> ans = new ArrayList<>();
            Map<Character, Integer> lastIndexMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                lastIndexMap.put(s.charAt(i), i);
            }
            for (int i = 0; i < s.length(); i++) {
                int boundary = i;
                int start = i;
                do {
                    int lastIndex = lastIndexMap.get(s.charAt(i));
                    boundary = Math.max(lastIndex, boundary);
                    i++;
                } while (i < boundary);
                if (i > boundary) {
                    i--;
                }
                ans.add(boundary - start + 1);
            }
            return ans;
        }
    }

}
