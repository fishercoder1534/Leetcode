package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1756 {
    public static class Solution1 {
        class MRUQueue {
            List<Integer> list;

            public MRUQueue(int n) {
                list = new ArrayList(n);
                for (int i = 1; i <= n; i++) {
                    list.add(i);
                }
            }

            public int fetch(int k) {
                int fetched = list.remove(k - 1);
                list.add(fetched);
                return fetched;
            }
        }

    }
}
