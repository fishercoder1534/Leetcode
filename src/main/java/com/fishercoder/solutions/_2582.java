package com.fishercoder.solutions;

public class _2582 {
    public static class Solution1 {
        public int passThePillow(int n, int time) {
            int person = 1;
            boolean goLeft = true;
            while (time-- > 0) {
                if (goLeft) {
                    person++;
                } else {
                    person--;
                }
                if (time == 0) {
                    return person;
                }
                if (person == n || person == 1) {
                    goLeft = !goLeft;
                }
            }
            return person;
        }
    }
}
