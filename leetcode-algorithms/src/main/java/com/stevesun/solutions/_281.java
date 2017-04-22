package com.stevesun.solutions;

import java.util.Iterator;
import java.util.List;

/**
 * Given two 1d vectors, implement an iterator to return their elements alternately.

 For example, given two 1d vectors:

 v1 = [1, 2]
 v2 = [3, 4, 5, 6]
 By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1, 3, 2, 4, 5, 6].

 Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

 Clarification for the follow up question - Update (2015-09-18):
 The "Zigzag" order is not clearly defined and is ambiguous for k > 2 cases. If "Zigzag" does not look right to you, replace "Zigzag" with "Cyclic". For example, given the following input:

 [1,2,3]
 [4,5,6,7]
 [8,9]
 It should return [1,4,8,2,5,9,3,6,7].
 */
public class _281 {

    private Iterator<Integer> i, j, tmp;

    public _281(List<Integer> v1, List<Integer> v2) {
        i = v2.iterator();
        j = v1.iterator();
    }

    public int next() {
        if (j.hasNext()) { tmp = j; j = i; i = tmp; }
        return i.next();
    }

    public boolean hasNext() {
        return i.hasNext() || j.hasNext();
    }

}
