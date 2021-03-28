package com.fishercoder.solutions;

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

    public static class Solution2 {
        /**My original idea on 3/28/2021, similar to the above idea in Solution1:
         *
         * we can use signal characters to sort these unsorted characters out
         1. z must be mapping to zero; 0
         2. x -> six; 6
         3. w -> two; 2
         4. u -> four; 4
         5. g -> eight; 8
         6. only two digits have f: five and four, four is represented by the letter u, so the remaining f must form five; 5
         7. only two digits have v: seven and five, five is done based on rule 6, so the remaining v must form seven; 7
         8. only two digits have h: three and eight, eight is done based on rule 5, so the remaining h must form three; 3
         9. four digits could have o: zero, one, two and four, since all the latter 3 digits have been done already, so the remaining o must form one; 1
         10. all the rest of the unmapped characters must be able to form a multiple of nine; 9
         11. then all 10 digits are sorted out
         */
    }

}
