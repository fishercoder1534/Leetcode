package com.stevesun.solutions;

/**
 * Given an integer, return its base 7 string representation.

 Example 1:
 Input: 100
 Output: "202"
 Example 2:
 Input: -7
 Output: "-10"

 Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7 {

    public String convertTo7(int num) {
        return String.valueOf(Integer.toString(num, 7));
    }
}
