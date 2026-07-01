package com.fishercoder.solutions.firstthousand;

public class _443 {
    public static class Solution1 {
        public int compress(char[] chars) {
            int i = 0; // Read pointer
            int res = 0; // Write pointer

            while (i < chars.length) {
                int j = i;
                // Advance j to find the end of the repeating group
                while (j < chars.length && chars[j] == chars[i]) {
                    j++;
                }

                // 1. Write the character
                chars[res++] = chars[i];

                // 2. If the group length is greater than 1, write the count
                int groupLength = j - i;
                if (groupLength > 1) {
                    for (char c : Integer.toString(groupLength).toCharArray()) {
                        chars[res++] = c;
                    }
                }

                // 3. Move the read pointer to the start of the next group
                i = j;
            }

            return res;
        }
    }
}
