package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _699 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/107107/easy-understood-o-n-2-solution-with-explanation
         */
        public List<Integer> fallingSquares(int[][] positions) {
            List<Interval> intervals = new ArrayList<>();
            List<Integer> result = new ArrayList<>();
            int height = 0;
            for (int[] position : positions) {
                Interval curr = new Interval(position[0], position[0] + position[1] - 1, position[1]);
                height = Math.max(height, getHeight(intervals, curr));
                result.add(height);
            }
            return result;
        }

        private int getHeight(List<Interval> intervals, Interval curr) {
            int preMaxHeight = 0;
            for (Interval interval : intervals) {
                if (interval.end < curr.start || interval.start > curr.end) {
                    continue;
                }
                preMaxHeight = Math.max(preMaxHeight, interval.height);
            }
            curr.height += preMaxHeight;
            intervals.add(curr);
            return curr.height;
        }

        class Interval {
            int start;
            int end;
            int height;

            public Interval(int start, int end, int height) {
                this.start = start;
                this.end = end;
                this.height = height;
            }
        }
    }
}
