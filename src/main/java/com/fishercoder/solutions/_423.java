package com.fishercoder.solutions;

/**
 * 423. Reconstruct Original Digits from English
 *
 * Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.

 Note:
 Input contains only lowercase English letters.
 Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
 Input length is less than 50,000.

 Example 1:
 Input: "owoztneoer"

 Output: "012"
 Example 2:
 Input: "fviefuro"

 Output: "45"

 */
public class _423 {

    public static class Solution1 {
        public String originalDigits(String s) {
            /**we can use one char as a representative to uniquely stand for one number,
             * for some numbers that we cannot find a unique representive, we can dedup.
             * e.g. for number one, if we use 'o' as its representive, then 'o' also exists in numbers 2, 4 and 0, so
             * we need to dedupe the 'o' in those numbers.
             * Also, the order to dedupe matters:
             * we'll have to dedupe for counts[3], counts[5], counts[7] first before we dedupe counts[1] and counts[9].*/
            int[] counts = new int[10];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'o') {
                    counts[1]++;//2,4,0
                }
                if (s.charAt(i) == 'w') {
                    counts[2]++;
                }
                if (s.charAt(i) == 'h') {
                    counts[3]++;//8
                }
                if (s.charAt(i) == 'u') {
                    counts[4]++;
                }
                if (s.charAt(i) == 'f') {
                    counts[5]++;//4
                }
                if (s.charAt(i) == 'x') {
                    counts[6]++;
                }
                if (s.charAt(i) == 'v') {
                    counts[7]++;//5
                }
                if (s.charAt(i) == 'g') {
                    counts[8]++;
                }
                if (s.charAt(i) == 'i') {
                    counts[9]++;//5,6,8
                }
                if (s.charAt(i) == 'z') {
                    counts[0]++;
                }
            }

            counts[3] -= counts[8];
            counts[5] -= counts[4];
            counts[7] -= counts[5];
            counts[1] = counts[1] - (counts[2] + counts[4] + counts[0]);
            counts[9] = counts[9] - (counts[5] + counts[6] + counts[8]);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < counts[i]; j++) {
                    stringBuilder.append(i);
                }
            }
            return stringBuilder.toString();
        }
    }

}
