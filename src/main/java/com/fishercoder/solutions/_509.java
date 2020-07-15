package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _509 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(n)
         */
        public int fib(int N) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            for (int i = 2; i <= N; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
            return list.get(N);
        }
    }

    public static class Solution2 {
        /**
         * Time: O(n)
         * Space: O(n)
         */
        public int fib(int N) {
            if (N < 2) {
                return N;
            }
            int[] fibNums = new int[N + 1];
            fibNums[0] = 0;
            fibNums[1] = 1;
            for (int i = 2; i <= N; i++) {
                fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
            }
            return fibNums[N];
        }
    }

    public static class Solution3 {
        /**
         * Time: O(n)
         * Space: O(1)
         */
        public int fib(int N) {
            if (N < 2) {
                return N;
            }
            int a = 0;
            int b = 1;
            while (N-- > 1) {
                int sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }
    }
}
