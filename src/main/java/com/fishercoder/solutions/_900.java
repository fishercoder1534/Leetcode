package com.fishercoder.solutions;

public class _900 {
    public static class Solution1 {
        public static class RLEIterator {

            int index;
            int[] array;

            public RLEIterator(int[] A) {
                index = 0;
                array = A;
            }

            public int next(int n) {
                int lastElement = -1;
                while (n > 0 && index < array.length) {
                    if (array[index] > n) {
                        array[index] -= n;
                        lastElement = array[index + 1];
                        break;
                    } else if (array[index] == n) {
                        array[index] = 0;
                        lastElement = array[index + 1];
                        index += 2;
                        break;
                    } else {
                        n -= array[index];
                        index += 2;
                    }
                }
                return lastElement;
            }

        }
    }
}
