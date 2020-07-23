package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _800 {
    public static class Solution1 {
        public String similarRGB(String color) {
            List<String> allShortHandCombinations = computeAllShorthandCombinations();
            int minSimilarity = Integer.MIN_VALUE;
            String result = "";
            for (String candidate : allShortHandCombinations) {
                int similarity = computeSimilarity(candidate, color);
                if (similarity > minSimilarity) {
                    result = candidate;
                    minSimilarity = similarity;
                }
            }
            return result;
        }

        private int computeSimilarity(String candidate, String color) {
            return -(Integer.parseInt(candidate.substring(1, 3), 16) - Integer.parseInt(
                    color.substring(1, 3), 16)) * (Integer.parseInt(candidate.substring(1, 3), 16)
                    - Integer.parseInt(color.substring(1, 3), 16))
                    - (Integer.parseInt(candidate.substring(3, 5), 16) - Integer.parseInt(
                    color.substring(3, 5), 16)) * (Integer.parseInt(candidate.substring(3, 5), 16)
                    - Integer.parseInt(color.substring(3, 5), 16))
                    - (Integer.parseInt(candidate.substring(5, 7), 16) - Integer.parseInt(
                    color.substring(5, 7), 16)) * (Integer.parseInt(candidate.substring(5, 7), 16)
                    - Integer.parseInt(color.substring(5, 7), 16));
        }

        private List<String> computeAllShorthandCombinations() {
            List<String> result = new ArrayList<>();
            List<Character> hexNumber = new ArrayList<>(
                    Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
                            'f'));
            for (int i = 0; i < hexNumber.size(); i++) {
                for (int j = 0; j < hexNumber.size(); j++) {
                    for (int k = 0; k < hexNumber.size(); k++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(hexNumber.get(i));
                        sb.append(hexNumber.get(i));
                        sb.append(hexNumber.get(j));
                        sb.append(hexNumber.get(j));
                        sb.append(hexNumber.get(k));
                        sb.append(hexNumber.get(k));
                        result.add(sb.toString());
                    }
                }
            }
            return result;
        }
    }
}
