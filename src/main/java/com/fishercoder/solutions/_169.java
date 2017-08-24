package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**169. Majority Element
 *
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

*/
public class _169 {

    public int majorityElement_bit_manipulation(int[] nums) {
        int[] bit = new int[32];//because an integer is 32 bits, so we use an array of 32 long
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num >> (31 - i) & 1) == 1) bit[i]++;//this is to compute each number's ones frequency
            }
        }
        int res = 0;
        //this below for loop is to construct the majority element: since every bit of this element would have appeared more than n/2 times
        for (int i = 0; i < 32; i++) {
            bit[i] = bit[i] > nums.length / 2 ? 1 : 0;//we get rid of those that bits that are not part of the majority number
            res += bit[i] * (1 << (31 - i));
        }
        return res;
    }

    //saw a really clever solution on Discuss, though it didn't use bit manipulatoin
    //this is actually applying a famous algorithm called Moore Voting algorithm: http://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html
    public int majorityElement_moore_voting_algorithm(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                majority = nums[i];
            } else if (nums[i] == majority) {
                count++;
            } else count--;
        }
        return majority;
    }

    public static void main(String... strings) {
        int[] nums = new int[]{1, 2, 3, 4, 2, 3, 2, 2, 4, 2};
        _169 test = new _169();
        System.out.println(test.majorityElement_bit_manipulation(nums));
    }

    //my natural idea is to either compute the frequency of each unique number or sort it and return the median, I can hardly think of 
    //how bit manipulation could come into play for this question
    //this is O(n) time.
    public int majorityElement_compute_frequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 2) return i;
        }
        return -1;
    }

    //This is O(nlogn) time.
    public int majorityElement_sort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
