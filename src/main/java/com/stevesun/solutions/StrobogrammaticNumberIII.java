package com.stevesun.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to count the total strobogrammatic numbers that exist in the range of low <= num <= high.

For example,
Given low = "50", high = "100", return 3. Because 69, 88, and 96 are three strobogrammatic numbers.

Note:
Because the range might be a large number, the low and high numbers are represented as string.

*/
public class StrobogrammaticNumberIII {
    Map<Character, Character> map = new HashMap<>();

    {
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
    }

    String low = "", high = "";

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
            if ((lo == hi && c == map.get(c)) || lo < hi)
                strobogrammaticInRange(arr, count, lo + 1, hi - 1);
        }
    }

    private boolean compare(String a, String b) {
        if (a.length() != b.length())
            return a.length() < b.length();
        int i = 0;
        while (i < a.length() && a.charAt(i) == b.charAt(i))
            i++;
        return i == a.length() ? true : a.charAt(i) <= b.charAt(i);
    }

}
