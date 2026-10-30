package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1177 {
    public static class Solution1 {
        /**
         * This one is correct from algorithm perspective, but not optimal enough and rejected on LeetCode due to TLE.
         * Time: O(N*Q) where N is the length of the string and Q is the number of the queries
         */
        public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
            List<Boolean> ans = new ArrayList<>();
            for (int i = 0; i < queries.length; i++) {
                if (canMakePali(queries[i], s)) {
                    ans.add(true);
                } else {
                    ans.add(false);
                }
            }
            return ans;
        }

        private boolean canMakePali(int[] query, String s) {
            String str = s.substring(query[0], query[1] + 1);
            if (str.length() == 1) {
                return true;
            }
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            int diffCount = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] % 2 != 0) {
                    diffCount++;
                }
            }
            return diffCount / 2 <= query[2];
        }
    }

    public static class Solution2 {
        /**
         * This solution optimizes the above solution to O(N + Q) time using Prefix Sums with Bitmasks.
         * Credit: Gemini
         */
        public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
            int n = queries.length;

            /*
             * prefixMasks[i] stores a snapshot of which characters have odd frequencies
             * from index 0 up to index i-1.
             * Each bit in the integer acts as a toggle switch for a letter ('a' to 'z').
             * Bit = 0 means EVEN count, Bit = 1 means ODD count.
             */
            int[] prefixMasks = new int[n + 1];

            int currentMask = 0;
            for (int i = 0; i < n; i++) {
                // Shift 1 to the left by the character's alphabet index (0 to 25)
                // XOR (^) toggles the bit: 0 becomes 1 (odd), 1 becomes 0 (even)
                currentMask ^= (1 << (s.charAt(i) - 'a'));

                prefixMasks[i + 1] = currentMask;
            }

            List<Boolean> ans = new ArrayList<>();
            for (int[] query : queries) {
                int left = query[0];
                int right = query[1];
                int k = query[2];

                /*
                 * THE XOR CANCELLATION TRICK:
                 * prefixMasks[right + 1] contains: (All letters before 'left') XOR (All letters inside the window)
                 * prefixMasks[left]      contains: (All letters before 'left')
                 *
                 * By XORing them together, the duplicate history from before 'left' cancels itself out
                 * to zero (A ^ A = 0), leaving ONLY the odd/even frequencies of the target window.
                 */
                int substringMask = prefixMasks[right + 1] ^ prefixMasks[left];

                // Integer.bitCount() counts how many bits are set to 1 (how many characters have odd counts)
                int oddCount = Integer.bitCount(substringMask);

                // Each single replacement 'k' can fix 2 odd counts simultaneously
                // by turning one odd character into another odd character.
                ans.add(oddCount / 2 <= k);
            }

            return ans;
        }
    }
}
