package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 699. Falling Squares
 *
 * On an infinite number line (x-axis), we drop given squares in the order they are given.
 * The i-th square dropped (positions[i] = (left, side_length)) is a
 * square with the left-most point being positions[i][0] and sidelength positions[i][1].
 * The square is dropped with the bottom edge parallel to the number line, and
 * from a higher height than all currently landed squares. We wait for each square to stick before dropping the next.
 * The squares are infinitely sticky on their bottom edge, and will
 * remain fixed to any positive length surface they touch (either the number line or another square).
 * Squares dropped adjacent to each other will not stick together prematurely.
 * Return a list ans of heights.
 * Each height ans[i] represents the current highest height of any square we have dropped,
 * after dropping squares represented by positions[0], positions[1], ..., positions[i].

 Example 1:

 Input: [[1, 2], [2, 3], [6, 1]]
 Output: [2, 5, 5]
 Explanation:


 After the first drop of positions[0] = [1, 2]:
 _aa
 _aa
 -------
 The maximum height of any square is 2.


 After the second drop of positions[1] = [2, 3]:
 __aaa
 __aaa
 __aaa
 _aa__
 _aa__
 --------------
 The maximum height of any square is 5.
 The larger square stays on top of the smaller square despite where its center
 of gravity is, because squares are infinitely sticky on their bottom edge.


 After the third drop of positions[1] = [6, 1]:
 __aaa
 __aaa
 __aaa
 _aa
 _aa___a
 --------------
 The maximum height of any square is still 5.

 Thus, we return an answer of [2, 5, 5].


 Example 2:

 Input: [[100, 100], [200, 100]]
 Output: [100, 100]
 Explanation: Adjacent squares don't get stuck prematurely - only their bottom edge can stick to surfaces.

 Note:
 1 <= positions.length <= 1000.
 1 <= positions[0] <= 10^8.
 1 <= positions[1] <= 10^6.
 */

public class _699 {
    public static class Solution1 {
        /**credit: https://discuss.leetcode.com/topic/107107/easy-understood-o-n-2-solution-with-explanation*/
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
