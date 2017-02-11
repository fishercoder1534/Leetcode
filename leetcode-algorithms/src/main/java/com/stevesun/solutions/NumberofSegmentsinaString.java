package com.stevesun.solutions;
/**434. Number of Segments in a String

Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5*/
public class NumberofSegmentsinaString {

    public static int countSegments(String s) {
        if (s == null || s.isEmpty()) return 0;
        String[] segments = s.split(" ");
        int count = 0;
        for (String seg : segments){
            if (seg.equals("")) continue;
            count++;
        }
        return count;
    }

    public static void main(String...args){
        String test = ", , , ,        a, eaefa";
        System.out.println(countSegments(test));
    }
}
