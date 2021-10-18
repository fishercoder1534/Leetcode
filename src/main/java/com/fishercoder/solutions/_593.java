package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _593 {
    public static class Solution1 {
        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            List<int[]> input = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
            List<List<int[]>> allPermuations = getAllPermutations(input);
            for (List<int[]> eachPermutation : allPermuations) {
                if (isValid(eachPermutation)) {
                    return true;
                }
            }
            return false;
        }

        private List<List<int[]>> getAllPermutations(List<int[]> input) {
            List<List<int[]>> result = new ArrayList();
            List<int[]> init = new ArrayList<>();
            result.add(init);
            return backTracking(result, input, 0);
        }

        private List<List<int[]>> backTracking(List<List<int[]>> result, List<int[]> input, int pos) {
            if (pos == input.size()) {
                return result;
            }
            List<List<int[]>> newResult = new ArrayList<>();
            for (List<int[]> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    List<int[]> newList = new ArrayList<>(eachList);
                    newList.add(i, input.get(pos));
                    newResult.add(newList);
                }
            }
            result = newResult;
            return backTracking(result, input, pos + 1);
        }

        private boolean isValid(List<int[]> points) {
            int[] p1 = points.get(0);
            int[] p2 = points.get(1);
            int[] p3 = points.get(2);
            int[] p4 = points.get(3);
            double distance = (Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
            return distance == (Math.pow(p2[0] - p3[0], 2) + Math.pow(p2[1] - p3[1], 2))
                    && distance == (Math.pow(p3[0] - p4[0], 2) + Math.pow(p3[1] - p4[1], 2))
                    && distance == (Math.pow(p4[0] - p1[0], 2) + Math.pow(p4[1] - p1[1], 2))
                    && isRightAngle(p1, p2, p3)
                    && noDuplicate(p1, p2, p3, p4);
        }

        public boolean noDuplicate(int[] p1, int[] p2, int[] p3, int[] p4) {
            return !Arrays.equals(p1, p2)
                    && !Arrays.equals(p1, p3)
                    && !Arrays.equals(p1, p4)
                    && !Arrays.equals(p2, p3)
                    && !Arrays.equals(p2, p4)
                    && !Arrays.equals(p3, p4);
        }

        public boolean isRightAngle(int[] p1, int[] p2, int[] p3) {
            double angle1 = Math.atan2(p2[1] - p1[1], p2[0] - p1[0]);
            double angle2 = Math.atan2(p3[1] - p1[1], p3[0] - p1[0]);
            double degree = Math.toDegrees(angle1 - angle2);
            return degree % 45 == 0;
        }
    }

}
