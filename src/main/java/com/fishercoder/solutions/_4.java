package com.fishercoder.solutions;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class _4 {

    public static class Solution1 {
        /**credit: https://discuss.leetcode.com/topic/28602/concise-java-solution-based-on-binary-search
         *
         * The key point of this problem is to ignore half part of A and B each step recursively by comparing the median of remaining A and B:

         if (aMid < bMid) Keep [aRight + bLeft]
         else Keep [bRight + aLeft]

         As the following: time=O(log(m + n))
         */
        public double findMedianSortedArrays(int[] A, int[] B) {
            int m = A.length;
            int n = B.length;
            int l = (m + n + 1) / 2;
            int r = (m + n + 2) / 2;
            return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
        }

        public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
            if (aStart > A.length - 1) {
                return B[bStart + k - 1];
            }
            if (bStart > B.length - 1) {
                return A[aStart + k - 1];
            }
            if (k == 1) {
                return Math.min(A[aStart], B[bStart]);
            }

            int aMid = Integer.MAX_VALUE;
            int bMid = Integer.MAX_VALUE;
            if (aStart + k / 2 - 1 < A.length) {
                aMid = A[aStart + k / 2 - 1];
            }
            if (bStart + k / 2 - 1 < B.length) {
                bMid = B[bStart + k / 2 - 1];
            }

            if (aMid < bMid) {
                return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check: aRight + bLeft
            } else {
                return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check: bRight + aLeft
            }
        }
    }

    public static class Solution2 {
        /**
         * Reference: https://leetcode.com/discuss/28843/my-accepted-java-solution:
         * Basic Idea is very similar to K-selection. it's easier to understand if you imagine this to be chopping off the last K elements from a total of len(A) + len(B) elements,
         * where K = (len(A) + len(B))/2.
         * we want to remove K, but each time we can remove only at most K/2 elements,
         * because we can only be sure that these elements are not within the first (len(A) + len(B)) -K elements.
         */
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int K = nums1.length + nums2.length;
            if (K % 2 == 0) {
                return (findMedianSortedArrays(nums1, nums2, (K - K / 2)) + findMedianSortedArrays(nums1, nums2, (K - (K / 2 + 1)))) / 2;
            } else {
                return findMedianSortedArrays(nums1, nums2, K - (K / 2 + 1));
            }
        }

        // k is the number of elements to REMOVE, or "Chop off"
        public double findMedianSortedArrays(int[] A, int[] B, int K) {

            int lowA = 0;
            int lowB = 0;
            int highA = A.length;
            int highB = B.length;
            int midA;
            int midB;
            while (K > 0 && highA > 0 && highB > 0) {
                int chopA = max(1, min(K / 2, (highA) / 2));
                int chopB = max(1, min(K / 2, (highB) / 2));

                midA = highA - chopA;
                midB = highB - chopB;
                if (A[midA] < B[midB]) { // here A[0 .. midA] < B[midB], and we know that B[0 .. midB-1] < B[midB], so B[midB..highB] can not possibly be within the first (len(A) + len(B) - K) elements, and can be safely removed.
                    highB = midB;
                    K = K - chopB;
                } else {
                    highA = midA;
                    K = K - chopA;
                }
            }

            if (highA == 0 && highB == 0) {
                return 0;
            }
            if (highA == 0) {
                return B[highB - 1 - K];
            }
            if (highB == 0) {
                return A[highA - 1 - K];
            }
            return max(A[highA - 1], B[highB - 1]);
        }
    }
}
