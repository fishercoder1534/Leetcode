package com.fishercoder.solutions;

public class _395 {
    public static class Solution1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/57372/java-divide-and-conquer-recursion-solution
         */
        public int longestSubstring(String s, int k) {
            return findLongestSubstring(s.toCharArray(), 0, s.length(), k);
        }

        int findLongestSubstring(char[] chars, int start, int end, int k) {
            /**Base case 1 of 2*/
            if (end - start < k) {
                return 0;
            }
            int[] count = new int[26];
            for (int i = start; i < end; i++) {
                int index = chars[i] - 'a';
                count[index]++;
            }

            /**For every character in the above frequency table*/
            for (int i = 0; i < 26; i++) {
                if (count[i] < k && count[i] > 0) {
                    for (int j = start; j < end; j++) {
                        if (chars[j] == i + 'a') {
                            int left = findLongestSubstring(chars, start, j, k);
                            int right = findLongestSubstring(chars, j + 1, end, k);
                            return Math.max(left, right);
                        }
                    }
                }
            }
            /**Base case 2 of 2:
             * when any characters in this substring has repeated at least k times, then this entire substring is a valid answer*/
            return end - start;
        }
    }

    public static class Solution2 {
        /**
         * classic sliding window approach.
         * credit: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/discuss/170010/Java-O(n)-Solution-with-Detailed-Explanation-Sliding-Window/774350
         */
        public int longestSubstring(String s, int k) {
            int res = 0;
            for (int numUniqueTarget = 1; numUniqueTarget <= 26; numUniqueTarget++) {
                res = Math.max(res, slidingWindowHelper(s, k, numUniqueTarget));
            }
            return res;
        }

        // sliding window template
        private int slidingWindowHelper(String s, int k, int numUniqueTarget) {
            int[] map = new int[26];
            int start = 0;
            int end = 0;
            int res = 0;
            int uniqueLetterCount = 0;
            int numNoLessThanK = 0;
            while (end < s.length()) {
                char c1 = s.charAt(end);
                if (map[c1 - 'a'] == 0) {
                    //we increment this when we include a new letter into our sliding window
                    uniqueLetterCount++;
                }
                map[c1 - 'a']++;
                if (map[c1 - 'a'] == k) {
                    //we increment this number when we find a letter's frequency reaches k
                    numNoLessThanK++;
                }
                end++;

                while (uniqueLetterCount > numUniqueTarget) {
                    //as long as the counter (the number of qualified letters) is greater than our target number,
                    //we can move the left pointer to the right,
                    //this keeps the interval within our sliding window always valid
                    char c2 = s.charAt(start);
                    if (map[c2 - 'a'] == k) {
                        //we decrement this numNoLessThanK when we find this letter's frequency equals
                        //to k because we'll move past this letter, i.e. our sliding window no longer includes it
                        numNoLessThanK--;
                    }
                    map[c2 - 'a']--;
                    if (map[c2 - 'a'] == 0) {
                        uniqueLetterCount--;
                    }
                    start++;
                }

                if (uniqueLetterCount == numNoLessThanK) {
                    res = Math.max(res, end - start);
                }
            }
            return res;
        }
    }
}
