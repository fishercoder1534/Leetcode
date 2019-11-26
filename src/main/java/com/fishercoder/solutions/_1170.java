package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1170. Compare Strings by Frequency of the Smallest Character
 *
 * Let's define a function f(s) over a non-empty string s,
 * which calculates the frequency of the smallest character in s.
 * For example, if s = "dcce" then f(s) = 2 because the smallest character is "c" and its frequency is 2.
 * Now, given string arrays queries and words,
 * return an integer array answer,
 * where each answer[i] is the number of words such that f(queries[i]) < f(W), where W is a word in words.
 *
 * Example 1:
 * Input: queries = ["cbd"], words = ["zaaaz"]
 * Output: [1]
 * Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
 *
 * Example 2:
 * Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 * Output: [1,2]
 * Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").
 *
 * Constraints:
 * 1 <= queries.length <= 2000
 * 1 <= words.length <= 2000
 * 1 <= queries[i].length, words[i].length <= 10
 * queries[i][j], words[i][j] are English lowercase letters.
 * */
public class _1170 {
    public static class Solution1 {
        /**
         * Use simple iteration when finding counts
         * Time: O(n^m) where m is the size of queries and n is the size of words
         * Space: O(max(m, n) where m is the size of queries and n is the size of words)
         * */
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] queriesMinFrequecies = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                queriesMinFrequecies[i] = computeLowestFrequency(queries[i]);
            }

            int[] wordsMinFrequecies = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                wordsMinFrequecies[i] = computeLowestFrequency(words[i]);
            }
            Arrays.sort(wordsMinFrequecies);

            int[] result = new int[queries.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = search(wordsMinFrequecies, queriesMinFrequecies[i]);
            }
            return result;
        }

        private int search(int[] nums, int target) {
            int count = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > target) {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }

        private int computeLowestFrequency(String string) {
            char[] str = string.toCharArray();
            Arrays.sort(str);
            String sortedString = new String(str);
            int frequency = 1;
            for (int i = 1; i < sortedString.length(); i++) {
                if (sortedString.charAt(i) == sortedString.charAt(0)) {
                    frequency++;
                } else {
                    break;
                }
            }
            return frequency;
        }
    }

    public static class Solution2 {
        /**
         * Use binary search when finding counts
         * Time: O(n^logn) where m is the size of queries and n is the size of words
         * Space: O(max(m, n) where m is the size of queries and n is the size of words)
         * */
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] queriesMinFrequecies = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                queriesMinFrequecies[i] = computeLowestFrequency(queries[i]);
            }

            int[] wordsMinFrequecies = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                wordsMinFrequecies[i] = computeLowestFrequency(words[i]);
            }
            Arrays.sort(wordsMinFrequecies);

            int[] result = new int[queries.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = binarySearch(wordsMinFrequecies, queriesMinFrequecies[i]);
            }
            return result;
        }

        private int binarySearch(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return nums.length - left;
        }

        private int computeLowestFrequency(String string) {
            char[] str = string.toCharArray();
            Arrays.sort(str);
            String sortedString = new String(str);
            int frequency = 1;
            for (int i = 1; i < sortedString.length(); i++) {
                if (sortedString.charAt(i) == sortedString.charAt(0)) {
                    frequency++;
                } else {
                    break;
                }
            }
            return frequency;
        }
    }
}
