package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2928 {
    public static class Solution1 {
        public int distributeCandies(int n, int limit) {
            List<List<Integer>> candidates = new ArrayList<>();
            for (int maxCandyForOneChild = limit; maxCandyForOneChild >= 0; maxCandyForOneChild--) {
                int remainingCandies = n - maxCandyForOneChild;
                for (int i = 0; i <= remainingCandies; i++) {
                    List<Integer> candidate = new ArrayList();
                    candidate.add(maxCandyForOneChild);
                    if (remainingCandies - i <= limit && i <= limit) {
                        candidate.add(i);
                        candidate.add(remainingCandies - i);
                    }
                    if (candidate.size() == 3) {
                        candidates.add(candidate);
                    }
                }
            }
            return candidates.size();
        }
    }
}
