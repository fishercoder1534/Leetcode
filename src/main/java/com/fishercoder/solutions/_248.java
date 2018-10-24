package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _248 {

    public static class Solution1 {
        /**Credit: https://discuss.leetcode.com/topic/31386/concise-java-solution
         *
         Construct char arrays from low.length() to high.length()
         Add stro pairs from outside
         When left > right, add eligible count
         */

        private static final char[][] pairs = {{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};

        public int strobogrammaticInRange(String low, String high) {
            int[] count = {0};
            for (int len = low.length(); len <= high.length(); len++) {
                char[] c = new char[len];
                dfs(low, high, c, 0, len - 1, count);
            }
            return count[0];
        }

        public void dfs(String low, String high , char[] c, int left, int right, int[] count) {
            if (left > right) {
                String s = new String(c);
                if ((s.length() == low.length() && s.compareTo(low) < 0)
                        || (s.length() == high.length() && s.compareTo(high) > 0)) {
                    return;
                }
                count[0]++;
                return;
            }
            for (char[] p : pairs) {
                c[left] = p[0];
                c[right] = p[1];
                if (c.length != 1 && c[0] == '0') {
                    continue;
                }
                if (left == right && p[0] != p[1]) {
                    continue;
                }
                dfs(low, high, c, left + 1, right - 1, count);
            }
        }
    }

    public static class Solution2 {
        Map<Character, Character> map = new HashMap<>();

        {
            map.put('1', '1');
            map.put('8', '8');
            map.put('6', '9');
            map.put('9', '6');
            map.put('0', '0');
        }

        String low = "";
        String high = "";

        public int strobogrammaticInRange(String low, String high) {
            this.low = low;
            this.high = high;
            int result = 0;
            for (int n = low.length(); n <= high.length(); n++) {
                int[] count = new int[1];
                strobogrammaticInRange(new char[n], count, 0, n - 1);
                result += count[0];
            }
            return result;
        }

        private void strobogrammaticInRange(char[] arr, int[] count, int lo, int hi) {
            if (lo > hi) {
                String s = new String(arr);
                if ((arr[0] != '0' || arr.length == 1) && compare(low, s) && compare(s, high)) {
                    count[0]++;
                }
                return;
            }
            for (Character c : map.keySet()) {
                arr[lo] = c;
                arr[hi] = map.get(c);
                if ((lo == hi && c == map.get(c)) || lo < hi) {
                    strobogrammaticInRange(arr, count, lo + 1, hi - 1);
                }
            }
        }

        private boolean compare(String a, String b) {
            if (a.length() != b.length()) {
                return a.length() < b.length();
            }
            int i = 0;
            while (i < a.length() && a.charAt(i) == b.charAt(i)) {
                i++;
            }
            return i == a.length() ? true : a.charAt(i) <= b.charAt(i);
        }
    }
}
