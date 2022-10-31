package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1670 {
    public static class Solution1 {
        /**
         * This is a brute force approach.
         * TODO: use two Deques to implement a solution.
         */
        public static class FrontMiddleBackQueue {
            List<Integer> list;

            public FrontMiddleBackQueue() {
                list = new ArrayList<>();
            }

            public void pushFront(int val) {
                list.add(0, val);
            }

            public void pushMiddle(int val) {
                list.add(list.size() / 2, val);
            }

            public void pushBack(int val) {
                list.add(val);
            }

            public int popFront() {
                if (list.size() > 0) {
                    return list.remove(0);
                }
                return -1;
            }

            public int popMiddle() {
                if (list.size() > 0) {
                    return list.remove(list.size() % 2 == 0 ? list.size() / 2 - 1 : list.size() / 2);
                }
                return -1;
            }

            public int popBack() {
                if (list.size() > 0) {
                    return list.remove(list.size() - 1);
                }
                return -1;
            }
        }
    }
}
