package com.fishercoder.solutions;

public class _299 {
    public static class Solution1 {
        public String getHint(String secret, String guess) {
            int[] secretCows = new int[10];
            int[] guessCows = new int[10];
            int bulls = 0;
            for (int i = 0; i < secret.length(); i++) {
                if (guess.charAt(i) == secret.charAt(i)) {
                    bulls++;
                } else {
                    secretCows[Character.getNumericValue(secret.charAt(i))]++;
                    guessCows[Character.getNumericValue(guess.charAt(i))]++;
                }
            }
            int cows = 0;
            for (int i = 0; i < 10; i++) {
                cows += Math.min(secretCows[i], guessCows[i]);
            }
            return bulls + "A" + cows + "B";
        }
    }
}
