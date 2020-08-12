package com.fishercoder.solutions;

import java.util.Arrays;

public class _1170 {
    public static class Solution1 {
        /**
         * Use simple iteration when finding counts
         * Time: O(n^m) where m is the size of queries and n is the size of words
         * Space: O(max(m, n) where m is the size of queries and n is the size of words)
         */
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
         */
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
