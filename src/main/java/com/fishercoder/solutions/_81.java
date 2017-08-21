package com.fishercoder.solutions;

/**
 * Follow up for "Search in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?

 Write a function to determine if a given target is in the array.
 */
public class _81 {

    public boolean search(int[] A, int target) {
        int len = A.length;
        if (len == 0) {
            return false;
        }
        if (len == 1) {
            if (A[0] == target) {
                return true;
            } else {
                return false;
            }
        }
        int watershed = A[0];
        int watershedIndex = 0;
        for (int i = 0; i < len - 1; i++) {
            if (A[i] > A[i + 1]) {
                watershed = A[i];
                watershedIndex = i;
                System.out.println("Place 1: watershed = " + watershed
                        + "\twatershedIndex = " + watershedIndex);
                for (int j = i + 1; j < len; j++) {
                    if (A[j] == A[i]) {
                        watershed = A[j];
                        watershedIndex = j;
                        System.out.println("Place 2: watershed = " + watershed
                                + "\twatershedIndex = " + watershedIndex);
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println("watershed = " + watershed + "\twatershedIndex = "
                + watershedIndex);
        if (target == watershed) {
            return true;
        } else if (target > watershed) {
			/*
			 * here is the tricky part: when target is greater than watershed,
			 * it's also possible that this list is ZERO rotated, i.e. it didn't
			 * rotate at all! Then at this moment, watershed is not the largest
			 * element int this array, so we need to binary search this whole
			 * array.
			 */
            if (watershedIndex == 0) {
                int start = 0;
                int end = len - 1;
                int mid = (start + end) / 2;
                while (start <= end) {
                    if (target > A[mid]) {
                        start = mid + 1;
                        mid = (start + end) / 2;
                    } else if (target < A[mid]) {
                        end = mid - 1;
                        mid = (start + end) / 2;
                    } else if (target == A[mid]) {
                        return true;
                    }
                }
                return false;
            } else {
                return false;
            }
        } else if (target < watershed) {
			/*
			 * target could be in either part of this sorted array, then we
			 * check if target is greater than A[0], if so, then search in the
			 * first part, if not, then check if it is greater than A[len - 1],
			 * if so, return -1, if not, search in the second part
			 */

            if (target == A[0]) {
                return true;
            } else if (target > A[0]) {
                int start = 1;
                int end = watershedIndex - 1;
                int mid = (start + end) / 2;
                while (start <= end) {
                    if (target > A[mid]) {
                        start = mid + 1;
                        mid = (start + end) / 2;
                    } else if (target < A[mid]) {
                        end = mid - 1;
                        mid = (start + end) / 2;
                    } else if (target == A[mid]) {
                        return true;
                    }
                }
                return false;
            } else if (target < A[0]) {
                if (target == A[len - 1]) {
                    return true;
                } else if (target > A[len - 1]) {
                    return false;
                } else if (target < A[len - 1]) {
                    int start = watershedIndex + 1;
                    int end = len - 2;
                    int mid = (start + end) / 2;
                    while (start <= end) {
                        if (target > A[mid]) {
                            start = mid + 1;
                            mid = (start + end) / 2;
                        } else if (target < A[mid]) {
                            end = mid - 1;
                            mid = (start + end) / 2;
                        } else if (target == A[mid]) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

}
