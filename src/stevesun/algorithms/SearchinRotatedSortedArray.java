package stevesun.algorithms;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class SearchinRotatedSortedArray {

    public int search(int[] A, int target) {
        int len = A.length;
        if (len == 0)
            return -1;
        if (len == 1) {
            if (A[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        int watershed = A[0];
        int watershedIndex = 0;
        for (int i = 0; i < len - 1; i++) {
            if (A[i] > A[i + 1]) {
                watershed = A[i];
                watershedIndex = i;
                break;
            }
        }
        System.out.println("watershed = " + watershed + "\twatershedIndex = "
                + watershedIndex);

        if (target == watershed)
            return watershedIndex;
        else if (target > watershed) {
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
                        return mid;
                    }
                }
                return -1;
            } else
                return -1;
        } else if (target < watershed) {
			/*
			 * target could be in either part of this sorted array, then we
			 * check if target is greater than A[0], if so, then search in the
			 * first part, if not, then check if it is greater than A[len - 1],
			 * if so, return -1, if not, search in the second part
			 */

            if (target == A[0]) {
                return 0;
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
                        return mid;
                    }
                }
                return -1;
            } else if (target < A[0]) {
                if (target == A[len - 1]) {
                    return len - 1;
                } else if (target > A[len - 1]) {
                    return -1;
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
                            return mid;
                        }
                    }
                    return -1;
                }
            }
        }
        return -1;
    }

}
