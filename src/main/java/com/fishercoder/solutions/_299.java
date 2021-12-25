package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

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

    public static class Solution2 {
        /**
         * My completely original solution on 12/24/2021.
         */
        public String getHint(String secret, String guess) {
            int bulls = 0;
            int cows = 0;
            boolean[] bulled = new boolean[secret.length()];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) == guess.charAt(i)) {
                    bulled[i] = true;
                    bulls++;
                }
            }
            for (int i = 0; i < secret.length(); i++) {
                if (!bulled[i]) {
                    int num = Character.getNumericValue(secret.charAt(i));
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            for (int i = 0; i < secret.length(); i++) {
                if (!bulled[i]) {
                    int num = Character.getNumericValue(guess.charAt(i));
                    if (map.getOrDefault(num, 0) > 1) {
                        map.put(num, map.get(num) - 1);
                        cows++;
                    } else if (map.getOrDefault(num, 0) == 1) {
                        map.remove(num);
                        cows++;
                    }
                }
            }
            return bulls + "A" + cows + "B";
        }
    }
}
