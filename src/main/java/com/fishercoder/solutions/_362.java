package com.fishercoder.solutions;
/**
 * 362. Design Hit Counter
 *
 * Design a hit counter which counts the number of hits received in the past 5 minutes.

 Each function accepts a timestamp parameter (in seconds granularity) and you may assume
 that calls are being made to the system in chronological order (ie, the timestamp is monotonically increasing).
 You may assume that the earliest timestamp starts at 1.

 It is possible that several hits arrive roughly at the same time.

 Example:
 HitCounter counter = new HitCounter();

 // hit at timestamp 1.
 counter.hit(1);

 // hit at timestamp 2.
 counter.hit(2);

 // hit at timestamp 3.
 counter.hit(3);

 // get hits at timestamp 4, should return 3.
 counter.getHits(4);

 // hit at timestamp 300.
 counter.hit(300);

 // get hits at timestamp 300, should return 4.
 counter.getHits(300);

 // get hits at timestamp 301, should return 3.
 counter.getHits(301);
 Follow up:
 What if the number of hits per second could be very large? Does your design scale?
 */

public class _362 {

    public static class Solution1 {
        public static class HitCounter {
            /**
             * Reference: https://discuss.leetcode.com/topic/48758/super-easy-design-o-1-hit-o-s-gethits-no-fancy-data-structure-is-needed,
             * I added one more field k to make it more generic.
             * It basically maintains a window of size 300, use modular to update the index.
             */
            private int[] times;
            private int[] hits;
            private int k;

            /**
             * Initialize your data structure here.
             */
            public HitCounter() {
                k = 300;
                times = new int[k];
                hits = new int[k];
            }

            /**
             * Record a hit.
             *
             * @param timestamp - The current timestamp (in seconds granularity).
             */
            public void hit(int timestamp) {
                int index = timestamp % k;
                if (times[index] != timestamp) {
                    times[index] = timestamp;
                    hits[index] = 1;
                } else {
                    hits[index]++;
                }
            }

            /**
             * Return the number of hits in the past 5 minutes.
             *
             * @param timestamp - The current timestamp (in seconds granularity).
             */
            public int getHits(int timestamp) {
                int total = 0;
                for (int i = 0; i < k; i++) {
                    if (timestamp - times[i] < k) {
                        total += hits[i];
                    }
                }
                return total;
            }
        }
    }
}