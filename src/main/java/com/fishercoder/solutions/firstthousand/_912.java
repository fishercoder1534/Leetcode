package com.fishercoder.solutions.firstthousand;

public class _912 {
    public static class Solution1 {
        /**
         * Implementation of MergeSort which is a stable sort, unlike QuickSort which isn't.
         */
        public int[] sortArray(int[] nums) {
            //use a helper function to take in two additional parameters for the ease of recursion
            return sort(nums, 0, nums.length - 1);
        }

        //this is the recursive function
        private int[] sort(int[] nums, int left, int right) {
            //this condition keeps dividing the array until nums becomes one individual item and then it goes back to the call stack
            if (left < right) {
                int mid = left + (right - left) / 2;
                sort(nums, left, mid);
                sort(nums, mid + 1, right);
                merge(nums, left, mid, right);
            }
            return nums;
        }

        private void merge(int[] nums, int left, int mid, int right) {
            int leftSize = mid - left + 1;
            int rightSize = right - mid;
            //use two temp array to copy the original values in the input before we overwrite them
            int[] leftHalf = new int[leftSize];
            int[] rightHalf = new int[rightSize];
            for (int i = 0; i < leftSize; i++) {
                //this index is key: it should be nums[left + i] as it should start from left instead of zero
                leftHalf[i] = nums[left + i];
            }
            for (int i = 0; i < rightSize; i++) {
                //similarly, this index is key as well: it should be nums[mid + i + 1] instead of starting from zero
                rightHalf[i] = nums[mid + i + 1];
            }
            int i = 0;
            int j = 0;
            //again, this index k = left is key, it should start from left instead of 0
            int k = left;
            while (i < leftSize && j < rightSize) {
                if (leftHalf[i] < rightHalf[j]) {
                    nums[k++] = leftHalf[i++];
                } else {
                    nums[k++] = rightHalf[j++];
                }
            }

            while (i < leftSize) {
                nums[k++] = leftHalf[i++];
            }
            while (j < rightSize) {
                nums[k++] = rightHalf[j++];
            }
        }
    }
}
