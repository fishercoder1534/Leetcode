package com.stevesun.solutions;

import java.util.Arrays;

/**
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
 * <p>
 * Try to solve it in linear time/space.
 * <p>
 * Return 0 if the array contains less than 2 elements.
 * <p>
 * You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 */
public class MaximumGap {
    //brute force
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; ) {
            while (i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }
            if (i == nums.length) {
                i--;
                max = (nums[i] - nums[i - 1] > max) ? nums[i] - nums[i - 1] : max;
                break;
            } else max = (nums[i] - nums[i - 1] > max) ? nums[i] - nums[i - 1] : max;
            if (nums[i] != nums[i - 1]) {
                i++;
            }
        }
        return max;
    }



    //http://www.programcreek.com/2014/03/leetcode-maximum-gap-java/
    class Bucket {
        int min = -1;
        int max = -1;

        public Bucket() {
            this.min = -1;
            this.max = -1;
        }
    }

    //compute interval and multiply by interval to get the index
    public int maximumGap_from_programcreek_1(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
            minNum = Math.min(minNum, nums[i]);
        }

        //initialize bucket array
        Bucket[] buckets = new Bucket[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        double interval = (double) nums.length/(maxNum - minNum);
        //distribute the array to different buckets
        for (int i = 0; i < nums.length; i++) {
            int index = (int) ((nums[i] - minNum) * interval);
            if (buckets[index].min == -1) {
                buckets[index].min = nums[i];
                buckets[index].max = nums[i];
            } else {
                buckets[index].min = Math.min(nums[i], buckets[index].min);
                buckets[index].max = Math.max(nums[i], buckets[index].max);
            }
        }

        //scan through the bucket array to find the maximal gap
        int result = 0;
        int prev = buckets[0].max;
        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i].min != -1) {
                result = Math.max(result, buckets[i].min - prev);
                prev = buckets[i].max;
            }
        }

        return result;
    }

    //compute gap and divide by gap to get the index
    public int maximumGap_from_programcreek_2(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
            minNum = Math.min(minNum, nums[i]);
        }

        //initialize bucket array
        Bucket[] buckets = new Bucket[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        double gap = (double) (maxNum - minNum)/(nums.length-1);
        //distribute the array to different buckets
        for (int i = 0; i < nums.length; i++) {
            int index = (int) ((nums[i] - minNum)/gap);
            if (buckets[index].min == -1) {
                buckets[index].min = nums[i];
                buckets[index].max = nums[i];
            } else {
                buckets[index].min = Math.min(nums[i], buckets[index].min);
                buckets[index].max = Math.max(nums[i], buckets[index].max);
            }
        }

        //scan through the bucket array to find the maximal gap
        int result = 0;
        int prev = buckets[0].max;
        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i].min != -1) {
                result = Math.max(result, buckets[i].min - prev);
                prev = buckets[i].max;
            }
        }

        return result;
    }
}
