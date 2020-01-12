package com.fishercoder.solutions;

/**
 * 1300. Sum of Mutated Array Closest to Target
 *
 * Given an integer array arr and a target value target, return the integer value such that when we change all the integers larger than value in the given array to be equal to value,
 * the sum of the array gets as close as possible (in absolute difference) to target.
 * In case of a tie, return the minimum such integer.
 * Notice that the answer is not neccesarilly a number from arr.
 *
 * Example 1:
 * Input: arr = [4,9,3], target = 10
 * Output: 3
 * Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.
 *
 * Example 2:
 * Input: arr = [2,3,5], target = 10
 * Output: 5
 *
 * Example 3:
 * Input: arr = [60864,25176,27249,21296,20204], target = 56803
 * Output: 11361
 * */
public class _1300 {
    public static class Solution1 {
        public int findBestValue(int[] arr, int target) {
            int ave = target / arr.length;
            int min = findMin(arr);
            int max = findMax(arr);
            //if ave is the best value, what's the difference to target?
            int closetDiff = findClosestDiffIfReplaceWithVal(arr, ave, target);
            int bestValue = ave;
            //extend candidate towards the right to see how close the sum could be to target
            int candidateOnTheRight = ave;
            while (candidateOnTheRight <= max) {
                int thisOne = findClosestDiffIfReplaceWithVal(arr, ++candidateOnTheRight, target);
                if (thisOne >= closetDiff) {
                    break;
                } else {
                    closetDiff = thisOne;
                    bestValue = candidateOnTheRight;
                }
            }

            //extend candidate towards the left to see how close the sum could be to target
            int candidateOnTheLeft = ave;
            while (candidateOnTheLeft >= min) {
                int thisOne = findClosestDiffIfReplaceWithVal(arr, --candidateOnTheLeft, target);
                if (thisOne >= closetDiff) {
                    break;
                } else {
                    closetDiff = thisOne;
                    bestValue = candidateOnTheLeft;
                }
            }
            return bestValue;
        }

        private int findClosestDiffIfReplaceWithVal(int[] arr, int replaceValue, int target) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > replaceValue) {
                    sum += replaceValue;
                } else {
                    sum += arr[i];
                }
            }
            return Math.abs(sum - target);
        }

        private int findMax(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }

        private int findMin(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }
            return min;
        }
    }
}
