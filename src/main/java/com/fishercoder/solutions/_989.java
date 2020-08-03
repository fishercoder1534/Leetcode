package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _989 {
    public static class Solution1 {
        public List<Integer> addToArrayForm(int[] A, int K) {
            List<Integer> kDigitsReversed = new ArrayList<>();
            int divisor = 10;
            while (K != 0) {
                kDigitsReversed.add(K % divisor);
                K /= 10;
            }
            List<Integer> result = new ArrayList<>();
            int prevFlow = 0;
            for (int i = A.length - 1, j = 0; i >= 0 || j < kDigitsReversed.size(); i--, j++) {
                int sum;
                if (i >= 0 && j < kDigitsReversed.size()) {
                    sum = A[i] + kDigitsReversed.get(j);
                } else if (i >= 0) {
                    sum = A[i];
                } else {
                    sum = kDigitsReversed.get(j);
                }
                int flow = 0;
                if (prevFlow != 0) {
                    sum += prevFlow;
                }
                if (sum > 9) {
                    flow = 1;
                }
                sum %= 10;
                prevFlow = flow;
                result.add(sum);
            }
            if (prevFlow != 0) {
                result.add(prevFlow);
            }
            Collections.reverse(result);
            return result;
        }
    }
}
