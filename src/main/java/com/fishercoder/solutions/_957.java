package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _957 {
    public static class Solution1 {
        public int[] prisonAfterNDays(int[] cells, int N) {
            Set<String> prisonStates = new HashSet<>();
            boolean hasCycle = false;
            int times = 0;
            for (int i = 0; i < N; i++) {
                int[] next = getNextDay(cells);
                String nextDayState = Arrays.toString(next);
                if (prisonStates.contains(nextDayState)) {
                    hasCycle = true;
                    break;
                } else {
                    prisonStates.add(nextDayState);
                    times++;
                }
                cells = next;
            }
            if (hasCycle) {
                N %= times;
                for (int i = 0; i < N; i++) {
                    cells = getNextDay(cells);
                }
            }
            return cells;
        }

        private int[] getNextDay(int[] cells) {
            int[] nextDay = new int[cells.length];
            for (int i = 0; i < cells.length; i++) {
                if (i == 0 || i == cells.length - 1) {
                    nextDay[i] = 0;
                } else {
                    nextDay[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
                }
            }
            return nextDay;
        }
    }
}