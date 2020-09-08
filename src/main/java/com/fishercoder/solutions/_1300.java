package com.fishercoder.solutions;

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
