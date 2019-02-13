package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 379. Design Phone Directory
 *
 * Design a Phone Directory which supports the following operations:

 get: Provide a number which is not assigned to anyone.
 check: Check if a number is available or not.
 release: Recycle or release a number.
 Example:

 // Init a phone directory containing a total of 3 numbers: 0, 1, and 2.
 PhoneDirectory directory = new PhoneDirectory(3);

 // It can return any available phone number. Here we assume it returns 0.
 directory.get();

 // Assume it returns 1.
 directory.get();

 // The number 2 is available, so return true.
 directory.check(2);

 // It returns 2, the only number that is left.
 directory.get();

 // The number 2 is no longer available, so return false.
 directory.check(2);

 // Release number 2 back to the pool.
 directory.release(2);

 // Number 2 is available again, return true.
 directory.check(2);
 */
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
