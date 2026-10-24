package com.fishercoder.solutions.firstthousand;

public class _641 {
    public static class Solution1 {
        /**
         *
         * The Standard Approach
         * <p>
         * A circular deque is traditionally implemented using a single fixed-size array and front and rear pointers that wrap around using the modulo operator (%).
         * This eliminates the need for two stacks and complex index arithmetic.
         */
        class MyCircularDeque {
            int[] deque;
            int size;
            int capacity;
            int front;
            int rear;

            public MyCircularDeque(int k) {
                deque = new int[k];
                size = 0;
                capacity = k;
                front = 0;
                rear = 0; //both front and rear pointers point at zero to begin with since it's an empty deque in the beginning
            }

            public boolean insertFront(int value) {
                if (isFull()) {
                    return false;
                }
                front = (front - 1 + capacity) % capacity; // front pointer will keep moving to the back by one before inserting so the front pointer always points at the front element
                deque[front] = value;
                size++;
                return true;
            }

            public boolean insertLast(int value) {
                if (isFull()) {
                    return false;
                }
                deque[rear] = value;
                rear = (rear + 1) % capacity; // rear pointer will keep moving to the front by one before inserting so the rear pointer always points at the rear element
                size++;
                return true;
            }

            public boolean deleteFront() {
                if (isEmpty()) {
                    return false;
                }
                front = (front + 1) % capacity; // move front pointer forward circularly
                size--;
                return true;
            }

            public boolean deleteLast() {
                if (isEmpty()) {
                    return false;
                }
                rear = (rear - 1 + capacity) % capacity; // move rear pointer backward circularly
                size--;
                return true;
            }

            public int getFront() {
                if (isEmpty()) {
                    return -1;
                }
                return deque[front];
            }

            public int getRear() {
                if (isEmpty()) {
                    return -1;
                }
                return deque[(rear - 1 + capacity) % capacity];
            }

            public boolean isEmpty() {
                return size == 0;
            }

            public boolean isFull() {
                return capacity == size;
            }
        }

    }
}
