package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _604 {
    public static class Solution1 {
        public static class StringIterator {

            Deque<int[]> deque;

            public StringIterator(String compressedString) {
                deque = new ArrayDeque<>();
                int len = compressedString.length();
                int i = 0;
                while (i < len) {
                    int j = i + 1;
                    while (j < len && Character.isDigit(compressedString.charAt(j))) {
                        j++;
                    }
                    deque.addLast(new int[]{compressedString.charAt(i) - 'A', Integer.parseInt(compressedString.substring(i + 1, j))});
                    i = j;
                }
            }

            public char next() {
                if (deque.isEmpty()) {
                    return ' ';
                }
                int[] top = deque.peek();
                top[1]--;
                if (top[1] == 0) {
                    deque.pollFirst();
                }
                return (char) ('A' + top[0]);
            }

            public boolean hasNext() {
                return !deque.isEmpty();
            }
        }
    }
}
