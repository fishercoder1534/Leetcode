package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _763 {

    public static class Solution1 {
        public List<Integer> partitionLabels(String S) {
            List<Integer> result = new ArrayList<>();
            int[] last = new int[26];
            /**This is the key step:
             * we find the last occurrence of each letter and record them in last[]*/
            for (int i = 0; i < S.length(); i++) {
                last[S.charAt(i) - 'a'] = i;
            }
            /**record the last end index of the current substring*/
            int end = 0;
            int start = 0;
            for (int i = 0; i < S.length(); i++) {
                end = Math.max(end, last[S.charAt(i) - 'a']);
                if (end == i) {
                    result.add(end - start + 1);
                    start = end + 1;
                }
            }
            return result;
        }
    }

}
