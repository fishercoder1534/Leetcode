package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _341 {

    public static class Solution1 {
        public static class NestedIterator implements Iterator<Integer> {

            private Queue<Integer> flattenedList;

            public NestedIterator(List<NestedInteger> nestedList) {
                flattenedList = new LinkedList<>();
                constructList(nestedList);
            }

            private void constructList(List<NestedInteger> nestedList) {
                for (NestedInteger nestedInteger : nestedList) {
                    if (nestedInteger.isInteger()) {
                        flattenedList.add(nestedInteger.getInteger());
                    } else {
                        constructList(nestedInteger.getList());
                    }
                }
            }

            @Override
            public Integer next() {
                return flattenedList.poll();
            }

            @Override
            public boolean hasNext() {
                return !flattenedList.isEmpty();
            }
        }
    }

}
