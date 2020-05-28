package com.fishercoder.solutions;

public class _292 {

    public static class Solution1 {
        /**
         * 1. If there are only 1 or 2 or 3 stones, you could always win by taking 1 or 2 or 3 stones;
         * 2. If there are 4 stones, you could never win because no matter you tak 1 or 2 or 3 stones, you could never take the 4th one;
         * 3. If there are 5 or 6 or 7 stones, you could always win because no matter how your opponent works, you'll always get the last one;
         * 4. Then we could deduce that as long as the number is not divisible by 4, you could always win.
         */

        public boolean canWinNim(int n) {
            return n % 4 != 0;
        }
    }
}
