package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Queue;

public class _942 {
    public static class Solution1 {
        public int[] diStringMatch(String S) {
            Queue<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i <= S.length(); i++) {
                deque.add(i);
            }
            int[] result = new int[S.length() + 1];
            for (int i = 0; i <= S.length(); i++) {
                if (i == S.length()) {
                    result[i] = ((ArrayDeque<Integer>) deque).pollLast();
                } else if (S.charAt(i) == 'I') {
                    result[i] = ((ArrayDeque<Integer>) deque).pollFirst();
                } else {
                    result[i] = ((ArrayDeque<Integer>) deque).pollLast();
                }
            }
            return result;
        }
    }
}
