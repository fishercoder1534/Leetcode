package com.fishercoder.solutions;

public class _2156 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/find-substring-with-given-hash-value/discuss/1730100/Java-rolling-hash(back-to-front)/1242659
         * <p>
         * We start from the right side and compute rolling hash when moving the window of size k towards the left.
         * This post explains why we need to start from the right and move towards the left: https://leetcode.com/problems/find-substring-with-given-hash-value/discuss/1730114/C%2B%2B-Rolling-Hash-O(N)-Time
         * so that we could use Rabin-Karp algorithm.
         */
        public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
            long weight = 1;
            for (int j = 0; j < k - 1; j++) {
                // calculate the weight which will be the power to the k-1
                // this will be used when we start shifting our window of size k to the left from the end of the string
                weight = (weight * power) % modulo;
            }
            /**We'll have to use the above for loop to calculate weight instead of using Math.pow(power, k - 1) which will render wrong results when power and k are big enough.*/

            // initialize the result string to empty string and keep updating it as we start from the end of the string, and we need to find the first substring that has the hashvalue
            String result = "";

            // right bound of the sliding window which starts at the end of the string
            int right = s.length() - 1;

            long hash = 0;
            for (int i = s.length() - 1; i >= 0; i--) {

                // add the next value of char for the left pointer into the sliding window
                int val = s.charAt(i) - 'a' + 1;

                // update the current hash value
                hash = (hash * power % modulo + val) % modulo;

                // when window is at size k, we need to check if we find a matching hash value
                // and update the result, and remove the right most char out of the window to prepare for next iteration
                if (right - i + 1 == k) {
                    if (hash == hashValue) {
                        result = s.substring(i, right + 1);
                    }
                    hash = (hash + modulo - (s.charAt(right--) - 'a' + 1) * weight % modulo) % modulo;
                }
            }

            return result;
        }
    }

}
