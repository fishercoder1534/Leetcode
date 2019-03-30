package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**436. Find Right Interval
 *
 * Given a set of intervals, for each of the interval i, check if there exists an interval j whose start
 * point is bigger than or equal to the end point of the interval i, which can be called that j is on the "right" of i.
 *
 * For any interval i, you need to store the minimum interval j's index,
 * which means that the interval j has the minimum start point to build the "right" relationship for interval i.
 * If the interval j doesn't exist, store -1 for the interval i. Finally, you need output the stored value of each interval as an array.
 *
 * Note:
 *
 * You may assume the interval's end point is always bigger than its start point.
 * You may assume none of these intervals have the same start point.
 *
 * Example 1:
 * Input: [ [1,2] ]
 * Output: [-1]
 * Explanation: There is only one interval in the collection, so it outputs -1.
 *
 * Example 2:
 * Input: [ [3,4], [2,3], [1,2] ]
 * Output: [-1, 0, 1]
 * Explanation: There is no satisfied "right" interval for [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point;
 * For [1,2], the interval [2,3] has minimum-"right" start point.
 *
 * Example 3:
 * Input: [ [1,4], [2,3], [3,4] ]
 * Output: [-1, 2, -1]
 * Explanation: There is no satisfied "right" interval for [1,4] and [3,4].
 * For [2,3], the interval [3,4] has minimum-"right" start point.
 * */

public class _436 {

    public static class Solution1 {
        public int[] findRightInterval(Interval[] intervals) {
            if (intervals == null || intervals.length == 0) {
                return new int[0];
            }
            int[] result = new int[intervals.length];
            result[0] = -1;
            Interval last = intervals[intervals.length - 1];
            Interval first = intervals[0];
            Map<Interval, Integer> map = new HashMap();
            for (int i = 0; i < intervals.length; i++) {
                map.put(intervals[i], i);
            }

            Collections.sort(Arrays.asList(intervals), (o1, o2) -> o1.start - o2.start);

            for (int i = 1; i < intervals.length; i++) {
                //TODO: use binary search for the minimum start interval for interval[i-1] instead of a while loop
                int tmp = i - 1;
                int tmpI = i;
                while (tmpI < intervals.length && intervals[tmpI].start < intervals[tmp].end) {
                    tmpI++;
                }
                if (tmpI < intervals.length) {
                    result[map.get(intervals[tmp])] = map.get(intervals[tmpI]);
                } else {
                    result[map.get(intervals[tmp])] = -1;
                }
            }
            if (result[intervals.length - 1] == 0 && last.end > first.start) {
                result[intervals.length - 1] = -1;
            }
            return result;
        }
    }

}
