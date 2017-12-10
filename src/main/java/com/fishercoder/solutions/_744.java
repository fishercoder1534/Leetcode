package com.fishercoder.solutions;

/**
 * 744. Find Smallest Letter Greater Than Target
 *
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

 Examples:
 Input:
 letters = ["c", "f", "j"]
 target = "a"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "c"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "d"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "g"
 Output: "j"

 Input:
 letters = ["c", "f", "j"]
 target = "j"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "k"
 Output: "c"

 Note:
 letters has a length in range [2, 10000].
 letters consists of lowercase letters, and contains at least 2 unique letters.
 target is a lowercase letter.
 */
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
