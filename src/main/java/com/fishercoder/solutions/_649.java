package com.fishercoder.solutions;

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
            while (!radiantQ.isEmpty() && !direQ.isEmpty()) {
                int radiantIndex = radiantQ.poll();
                int direIndex = direQ.poll();
                if (radiantIndex < direIndex) {
                    /**Radiant will ban Dire in this case, so we'll add radiant index back to the queue plus n*/
                    radiantQ.offer(radiantIndex + len);
                } else {
                    direQ.offer(direIndex + len);
                }
            }
            return radiantQ.isEmpty() ? "Dire" : "Radiant";
        }
    }
}
