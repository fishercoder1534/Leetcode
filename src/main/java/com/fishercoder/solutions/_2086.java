package com.fishercoder.solutions;

public class _2086 {
    public static class Solution1 {
        public int minimumBuckets(String street) {
            int minBuckets = 0;
            int[] buckets = new int[street.length()];
            for (int i = 0; i < street.length(); i++) {
                if (street.charAt(i) == 'H') {
                    if (i + 1 < street.length() && street.charAt(i + 1) == '.') {
                        if (i - 1 >= 0 && buckets[i - 1] == 1) {
                            continue;
                        }
                        buckets[i + 1] = 1;
                        minBuckets++;
                    } else if (i + 1 < street.length() && street.charAt(i + 1) == 'H') {
                        if (i - 1 < 0) {
                            return -1;
                        } else if (i - 1 >= 0 && street.charAt(i - 1) == 'H') {
                            return -1;
                        } else {
                            if (buckets[i - 1] == 1) {
                                continue;
                            } else {
                                buckets[i - 1] = 1;
                                minBuckets++;
                            }
                        }
                    } else if (i + 1 >= street.length() && i - 1 < 0) {
                        return -1;
                    } else if (i - 1 >= 0 && street.charAt(i - 1) == '.') {
                        if (buckets[i - 1] == 1) {
                            continue;
                        } else {
                            minBuckets++;
                            buckets[i - 1] = 1;
                        }
                    } else if (i + 1 >= street.length() && i - 1 >= 0 && street.charAt(i - 1) == 'H') {
                        return -1;
                    }
                }
            }
            return minBuckets;
        }
    }
}
