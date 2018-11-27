package com.fishercoder.solutions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 284. Peeking Iterator
 *
 * Given an Iterator class interface with methods: next() and hasNext(),
 * design and implement a PeekingIterator that support
 * the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

 Here is an example. Assume that the iterator is initialized to the beginning of the queue: [1, 2, 3].

 Call next() gets you 1, the first element in the queue.

 Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.

 You call next() the final time and it returns 3, the last element. Calling hasNext() after that should return false.

 Follow up: How would you extend your design to be generic and work with all types, not just integer?
 */
public class _284 {
    public static class Solution1 {
        public static class PeekingIterator implements Iterator<Integer> {

            private Queue<Integer> queue;

            public PeekingIterator(Iterator<Integer> iterator) {
                // initialize any member here.
                queue = new LinkedList<>();
                while (iterator.hasNext()) {
                    queue.add(iterator.next());
                }
            }

            // Returns the next element in the iteration without advancing the iterator.
            public Integer peek() {
                return queue.peek();
            }

            // hasNext() and next() should behave the same as in the Iterator interface.
            // Override them if needed.
            @Override
            public Integer next() {
                return queue.poll();
            }

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }
        }
    }
}