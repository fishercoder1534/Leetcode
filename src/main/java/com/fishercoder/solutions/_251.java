package com.fishercoder.solutions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _251 {

    public static class Solution1 {
        class Vector2D implements Iterator<Integer> {
            private Queue<Integer> cache;
            private List<List<Integer>> vec2d;

            public Vector2D(List<List<Integer>> vec2d) {
                this.vec2d = vec2d;
                this.cache = new LinkedList<Integer>();
                if (vec2d != null && vec2d.size() > 0) {
                    for (List<Integer> list : vec2d) {
                        for (int i : list) {
                            cache.offer(i);
                        }
                    }
                }
            }

            @Override
            public Integer next() {
                return cache.poll();
            }

            @Override
            public boolean hasNext() {
                return !cache.isEmpty();
            }
        }
    }
}