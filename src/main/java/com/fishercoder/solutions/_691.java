package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 691. Stickers to Spell Word
 *
 * We are given N different types of stickers. Each sticker has a lowercase English word on it.
 * You would like to spell out the given target string by cutting individual letters from your collection of stickers and rearranging them.
 * You can use each sticker more than once if you want, and you have infinite quantities of each sticker.
 * What is the minimum number of stickers that you need to spell out the target? If the task is impossible, return -1.

 Example 1:
 Input:
 ["with", "example", "science"], "thehat"
 Output:
 3

 Explanation:
 We can use 2 "with" stickers, and 1 "example" sticker.
 After cutting and rearrange the letters of those stickers, we can form the target "thehat".
 Also, this is the minimum number of stickers necessary to form the target string.

 Example 2:
 Input:
 ["notice", "possible"], "basicbasic"
 Output:
 -1

 Explanation:
 We can't form the target "basicbasic" from cutting letters from the given stickers.

 Note:
 stickers has length in the range [1, 50].
 stickers consists of lowercase English words (without apostrophes).
 target has length in the range [1, 15], and consists of lowercase English letters.
 In all test cases, all words were chosen randomly from the 1000 most common US English words, and the target was chosen as a concatenation of two random words.
 The time limit may be more challenging than usual. It is expected that a 50 sticker test case can be solved within 35ms on average.
 */
public class _691 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/106273/c-java-python-dp-memoization-with-optimization-29-ms-c/2
         */
        public int minStickers(String[] stickers, String target) {
            int m = stickers.length;
            int[][] mp = new int[m][26];
            Map<String, Integer> dp = new HashMap<>();
            for (int i = 0; i < m; i++) {
                for (char c : stickers[i].toCharArray()) {
                    mp[i][c - 'a']++;
                }
            }
            dp.put("", 0);
            return helper(dp, mp, target);
        }

        private int helper(Map<String, Integer> dp, int[][] mp, String target) {
            if (dp.containsKey(target)) {
                return dp.get(target);
            }
            int ans = Integer.MAX_VALUE;
            int n = mp.length;
            int[] tar = new int[26];
            for (char c : target.toCharArray()) {
                tar[c - 'a']++;
            }
            // try every sticker
            for (int i = 0; i < n; i++) {
                // optimization
                if (mp[i][target.charAt(0) - 'a'] == 0) {
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                // apply a sticker on every character a-z
                for (int j = 0; j < 26; j++) {
                    if (tar[j] > 0) {
                        for (int k = 0; k < Math.max(0, tar[j] - mp[i][j]); k++) {
                            sb.append((char) ('a' + j));
                        }
                    }
                }
                String s = sb.toString();
                int tmp = helper(dp, mp, s);
                if (tmp != -1) {
                    ans = Math.min(ans, 1 + tmp);
                }
            }
            dp.put(target, ans == Integer.MAX_VALUE ? -1 : ans);
            return dp.get(target);
        }
    }
}
