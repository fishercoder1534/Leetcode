package com.fishercoder.solutions.secondthousand;

public class _1899 {
    public static class Solution1 {
        public boolean mergeTriplets(int[][] triplets, int[] target) {
            int[] base = new int[3];
            int baseIndex = -1;
            for (int i = 0; i < triplets.length; i++) {
                if (findBaseTriplet(triplets[i], target)) {
                    base = triplets[i];
                    baseIndex = i;
                    break;
                }
            }
            for (int i = 0; i < triplets.length; i++) {
                if (i != baseIndex) {
                    boolean merged = false;
                    if (shouldMerge(triplets[i], target, 0)) {
                        merged = true;
                        base = mergeTriplets(triplets[i], base);
                    }
                    if (!merged && shouldMerge(triplets[i], target, 1)) {
                        merged = true;
                        base = mergeTriplets(triplets[i], base);
                    }
                    if (!merged && shouldMerge(triplets[i], target, 2)) {
                        base = mergeTriplets(triplets[i], base);
                    }
                }
            }
            return base[0] == target[0] && base[1] == target[1] && base[2] == target[2];
        }

        private int[] mergeTriplets(int[] triplet, int[] base) {
            return new int[]{Math.max(triplet[0], base[0]), Math.max(triplet[1], base[1]), Math.max(triplet[2], base[2])};
        }

        private boolean shouldMerge(int[] triplet, int[] target, int i) {
            if (triplet[i] == target[i]) {
                //check the other two indexes not exceeding target
                if (i == 0) {
                    return triplet[1] <= target[1] && triplet[2] <= target[2];
                } else if (i == 1) {
                    return triplet[0] <= target[0] && triplet[2] <= target[2];
                } else if (i == 2) {
                    return triplet[0] <= target[0] && triplet[1] <= target[1];
                }
            }
            return false;
        }

        private boolean findBaseTriplet(int[] triplet, int[] target) {
            if (triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] <= target[2]) {
                return true;
            }
            return false;
        }
    }
}
