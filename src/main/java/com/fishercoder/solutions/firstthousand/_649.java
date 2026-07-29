package com.fishercoder.solutions.firstthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _649 {

    public static class Solution1 {
        public String predictPartyVictory(String senate) {
            Queue<Integer> radiantQ = new LinkedList<>();
            Queue<Integer> direQ = new LinkedList<>();
            int len = senate.length();
            for (int i = 0; i < len; i++) {
                if (senate.charAt(i) == 'R') {
                    radiantQ.offer(i);
                } else {
                    direQ.offer(i);
                }
            }

            // Simulate rounds until one queue becomes empty
            while (!radiantQ.isEmpty() && !direQ.isEmpty()) {
                int radiantIndex = radiantQ.poll();
                int direIndex = direQ.poll();

                // The senator with the lower index votes first and bans the other
                if (radiantIndex < direIndex) {
                    // Radiant votes first -> ban Dire -> Radiant moves to next round
                    radiantQ.offer(radiantIndex + len);
                } else {
                    // Dire votes first -> ban Radiant -> Dire moves to next round
                    direQ.offer(direIndex + len);
                }
            }
            return radiantQ.isEmpty() ? "Dire" : "Radiant";
        }
    }
}
