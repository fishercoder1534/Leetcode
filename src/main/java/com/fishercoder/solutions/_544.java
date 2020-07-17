package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _544 {

    public String findContestMatch(int n) {
        List<String> pairs = new ArrayList<>();
        int left = 1;
        int right = n;
        while (left < right) {
            pairs.add("(" + left + "," + right + ")");
            left++;
            right--;
        }
        if (n == 2) {
            return pairs.get(0);
        }
        return generateFinal(pairs, n / 2);
    }

    private String generateFinal(List<String> pairs, int n) {
        if (n > 2) {
            int size = pairs.size();
            int left = 0;
            int right = size - 1;
            List<String> newPairs = new ArrayList<>();
            while (left < right) {
                String newPair = "(" + pairs.get(left) + "," + pairs.get(right) + ")";
                newPairs.add(newPair);
                left++;
                right--;
            }
            return generateFinal(newPairs, n / 2);
        }
        return "(" + pairs.get(0) + "," + pairs.get(1) + ")";
    }

}
