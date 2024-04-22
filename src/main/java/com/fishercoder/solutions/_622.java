package com.fishercoder.solutions;

import java.util.Arrays;

public class _622 {
    public static class Solution1 {
        public static class MyCircularQueue {

            int[] arr;
            int rearIndex;//this one points to the rear of the queue and could grow to 3000 which is the max calls that this problem is bound to
            int size;//this is the max size of this circule queue
            int frontIndex;

            public MyCircularQueue(int k) {
                arr = new int[k];
                Arrays.fill(arr, -1);
                size = k;
                rearIndex = 0;
                frontIndex = 0;
            }

            public boolean enQueue(int value) {
                if (arr[rearIndex % size] == -1) {
                    arr[rearIndex % size] = value;
                    rearIndex++;
                    return true;
                } else {
                    return false;
                }
            }

            public boolean deQueue() {
                if (arr[frontIndex % size] != -1) {
                    arr[frontIndex % size] = -1;
                    frontIndex++;
                    return true;
                } else {
                    return false;
                }
            }

            public int Front() {
                return arr[frontIndex % size];
            }

            public int Rear() {
                return arr[(rearIndex - 1) % size];
            }

            public boolean isEmpty() {
                return rearIndex == frontIndex;
            }

            public boolean isFull() {
                return Math.abs(rearIndex - frontIndex) == size;
            }
        }

    }
}
