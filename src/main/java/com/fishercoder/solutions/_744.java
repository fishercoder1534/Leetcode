package com.fishercoder.solutions;

public class _744 {
    public static class Solution1 {
        public char nextGreatestLetter(char[] letters, char target) {
            if (letters[0] > target) {
                return letters[0];
            }
            int left = 0;
            int right = letters.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (letters[mid] > target) {
                    while (letters[mid] > target) {
                        mid--;
                    }
                    return letters[++mid];
                } else {
                    left = mid + 1;
                }
            }
            if (right < letters.length && letters[right] > target) {
                return letters[right];
            }
            return letters[0];
        }
    }
}
