package com.fishercoder.solutions;

public class _809 {
    public static class Solution1 {
        public int expressiveWords(String S, String[] words) {
            int ans = 0;
            for (String w : words) {
                if (check(S, w)) {
                    ans++;
                }
            }
            return ans;
        }

        private boolean check(String S, String w) {
            int i = 0;
            int j = 0;
            /* Logic is to check whether character at same index of S and w are same
               if same,
                1. Find the consecutive number of occurrences of the char in S (say len1) and w ( say len2)
                2. If len1 == len 2 , move to the next char in S and w
                3. If  len1 >= 3 and len2 < len1, means we can make the char in w stretchy to match len1
                4. else, return false, because it's not possible to stretch the char in w
             */
            while (i < S.length() && j < w.length()) {
                char ch1 = S.charAt(i);
                char ch2 = w.charAt(j);

                int len1 = getLen(S, i);
                int len2 = getLen(w, j);
                if (ch1 == ch2) {
                    if (len1 == len2) {
                        i = i + len1;
                        j = j + len2;
                    } else if (len1 >= 3 && len2 < len1) {
                        i = i + len1;
                        j = j + len2;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return i == S.length() && j == w.length();
        }

        private int getLen(String value, int i) {
            i = i + 1;
            int count = 1;
            for (int j = i; j < value.length(); j++) {
                if (value.charAt(j) == value.charAt(i - 1)) {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }
    }
}
