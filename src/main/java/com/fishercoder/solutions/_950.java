package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class _950 {
    public static class Solution1 {
        public int[] deckRevealedIncreasing(int[] deck) {
            Arrays.sort(deck);
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = deck.length - 1; i >= 0; i--) {
                if (i != deck.length - 1) {
                    deque.addFirst(deque.pollLast());
                }
                deque.addFirst(deck[i]);
            }
            int[] result = new int[deck.length];
            int i = 0;
            while (!deque.isEmpty()) {
                result[i++] = deque.pollFirst();
            }
            return result;
        }
    }
}
