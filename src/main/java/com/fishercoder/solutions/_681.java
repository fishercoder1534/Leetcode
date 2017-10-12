package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 681. Next Closest Time
 *
 * Given a time represented in the format "HH:MM",
 * form the next closest time by reusing the current digits.
 * There is no limit on how many times a digit can be reused.
 * You may assume the given input string is always valid.
 * For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.

 Example 1:

 Input: "19:34"
 Output: "19:39"
 Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39,
 which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.

 Example 2:

 Input: "23:59"
 Output: "22:22"
 Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22.
 It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.

 */
public class _681 {
    public static class Solution1 {
        public String nextClosestTime(String time) {
            int cur = 60 * Integer.parseInt(time.substring(0, 2));
            cur += Integer.parseInt(time.substring(3));
            Set<Integer> allowed = new HashSet();
            for (char c : time.toCharArray()) {
                if (c != ':') {
                    allowed.add(c - '0');
                }
            }

            while (true) {
                cur = (cur + 1) % (24 * 60);
                int[] digits = new int[]{cur / 60 / 10, cur / 60 % 10, cur % 60 / 10, cur % 60 % 10};
                search:
                {
                    for (int d : digits) {
                        if (!allowed.contains(d)) {
                            break search;
                        }
                    }
                    return String.format("%02d:%02d", cur / 60, cur % 60);
                }
            }
        }
    }
}
