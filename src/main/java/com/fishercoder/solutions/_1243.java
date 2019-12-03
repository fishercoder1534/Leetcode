package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1243. Array Transformation
 *
 * Given an initial array arr, every day you produce a new array using the array of the previous day.
 *
 * On the i-th day, you do the following operations on the array of day i-1 to produce the array of day i:
 *
 * If an element is smaller than both its left neighbor and its right neighbor, then this element is incremented.
 * If an element is bigger than both its left neighbor and its right neighbor, then this element is decremented.
 * The first and last elements never change.
 * After some days, the array does not change. Return that final array.
 *
 * Example 1:
 * Input: arr = [6,2,3,4]
 * Output: [6,3,3,4]
 * Explanation:
 * On the first day, the array is changed from [6,2,3,4] to [6,3,3,4].
 * No more operations can be done to this array.
 *
 * Example 2:
 * Input: arr = [1,6,3,4,3,5]
 * Output: [1,4,4,4,4,5]
 * Explanation:
 * On the first day, the array is changed from [1,6,3,4,3,5] to [1,5,4,3,4,5].
 * On the second day, the array is changed from [1,5,4,3,4,5] to [1,4,4,4,4,5].
 * No more operations can be done to this array.
 *
 * Constraints:
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 100
 * */
public class _1243 {
    public static class Solution1 {
        public List<Integer> transformArray(int[] arr) {
            int[] copy;
            do {
                copy = Arrays.copyOf(arr, arr.length);
                for (int i = 1; i < arr.length - 1; i++) {
                    if (copy[i] < copy[i - 1] && copy[i] < copy[i + 1]) {
                        arr[i]++;
                    } else if (copy[i] > copy[i - 1] && copy[i] > copy[i + 1]) {
                        arr[i]--;
                    }
                }
            } while (!Arrays.equals(copy, arr));
            return Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}
