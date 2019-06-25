package com.fishercoder.solutions;

/**
 * 551. Student Attendance Record I
 *
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:

 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:
 Input: "PPALLP"
 Output: True

 Example 2:
 Input: "PPALLL"
 Output: False

 */
public class _551 {

    public static class Solution1 {
        public boolean checkRecord(String s) {
            int aCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    aCount++;
                    if (aCount > 1) {
                        return false;
                    }
                } else if (s.charAt(i) == 'L') {
                    int continuousLCount = 0;
                    while (i < s.length() && s.charAt(i) == 'L') {
                        i++;
                        continuousLCount++;
                        if (continuousLCount > 2) {
                            return false;
                        }
                    }
                    i--;
                }
            }
            return true;
        }
    }

}
