package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _379 {

    public static class Solution1 {
        private class PhoneDirectory {
            private Queue<Integer> phoneDir;
            private Set<Integer> used;

            /**
             * Initialize your data structure here
             *
             * @param maxNumbers - The maximum numbers that can be stored in the phone directory.
             */
            public PhoneDirectory(int maxNumbers) {
                phoneDir = new LinkedList();
                int number = 0;
                while (maxNumbers-- > 0) {
                    phoneDir.add(number++);
                }
                used = new HashSet();
            }

            /**
             * Provide a number which is not assigned to anyone.
             *
             * @return - Return an available number. Return -1 if none is available.
             */
            public int get() {
                if (phoneDir.peek() == null) {
                    return -1;
                }
                int newNumber = phoneDir.poll();
                used.add(newNumber);
                return newNumber;
            }

            /**
             * Check if a number is available or not.
             */
            public boolean check(int number) {
                return !used.contains(number);
            }

            /**
             * Recycle or release a number.
             */
            public void release(int number) {
                if (used.remove(number)) {
                    phoneDir.add(number);
                }
            }
        }
    }
}
