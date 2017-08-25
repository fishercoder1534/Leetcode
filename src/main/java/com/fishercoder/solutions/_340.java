package com.fishercoder.solutions;

/**
 * 340. Longest Substring with At Most K Distinct Characters
 *
 * Given a string, find the length of the longest substring T that contains at most k distinct characters.

 For example, Given s = “eceba” and k = 2,

 T is "ece" which its length is 3.

 */
public class _340 {

    /**credit: https://discuss.leetcode.com/topic/41671/15-lines-java-solution-using-slide-window*/
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int left = 0;
        int result = 0;
        int num = 0;
        for (int right = 0; right < s.length(); right++) {
            if (count[s.charAt(right)]++ == 0) {
                num++;
            }
            if (num > k) {
                while (--count[s.charAt(left++)] > 0) {};
                num--;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

}
