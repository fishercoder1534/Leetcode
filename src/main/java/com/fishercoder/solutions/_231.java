package com.fishercoder.solutions;

public class _231 {
    public static class Solution1 {
        public boolean isPowerOfTwo(int n) {
            //after writing out the binary representation of some numbers: 1,2,4,8,16,32, you can easily figure out that
            //every number that is power of two has only one bit that is 1
            //then we can apply that cool trick that we learned from {@link easy._191}: n&(n-1) which will clear the least significant bit in n to zero
            return n > 0 && (n & (n - 1)) == 0;
        }
    }
}
