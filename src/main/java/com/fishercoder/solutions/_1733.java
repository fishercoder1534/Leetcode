package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1733 {
    public static class Solution1 {
        public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
            Map<Integer, Set<Integer>> langMap = new HashMap<>();
            for (int i = 0; i < languages.length; i++) {
                Set<Integer> set = new HashSet<>();
                langMap.put(i + 1, set);
                for (int lang : languages[i]) {
                    set.add(lang);
                }
            }
            boolean[] canCommunicate = new boolean[friendships.length];
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < friendships.length; j++) {
                    int friend1 = friendships[j][0];
                    int friend2 = friendships[j][1];
                    if (langMap.get(friend1).contains(i) && langMap.get(friend2).contains(i)) {
                        canCommunicate[j] = true;
                    }
                }
            }
            int minTeach = friendships.length;
            for (int i = 1; i <= n; i++) {
                Set<Integer> teach = new HashSet<>();
                for (int j = 0; j < friendships.length; j++) {
                    if (!canCommunicate[j]) {
                        int friend1 = friendships[j][0];
                        int friend2 = friendships[j][1];
                        if (!langMap.get(friend1).contains(i)) {
                            teach.add(friend1);
                        }
                        if (!langMap.get(friend2).contains(i)) {
                            teach.add(friend2);
                        }
                    }
                }
                minTeach = Math.min(minTeach, teach.size());
            }
            return minTeach;
        }
    }
}
