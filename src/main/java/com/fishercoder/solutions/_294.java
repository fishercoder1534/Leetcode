package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _294 {

    public static class Solution1 {
        public boolean canWin(String s) {
            List<String> res = new ArrayList<>();
            char[] charArray = s.toCharArray();
            for (int i = 0; i < s.length() - 1; i++) {
                if (charArray[i] == '+' && charArray[i + 1] == '+') {
                    //change these two bits to '-'
                    charArray[i] = '-';
                    charArray[i + 1] = '-';
                    res.add(String.valueOf(charArray));
                    //change these two bits back to '+' for its next move
                    charArray[i] = '+';
                    charArray[i + 1] = '+';
                }
            }
            /**The above part is the same of Flip Game I.
             * The only added part is the following piece of logic (so-called backtracking.)*/
            for (String str : res) {
                if (!canWin(str)) {
                    return true;
                }
            }
            return false;
        }
    }

}
