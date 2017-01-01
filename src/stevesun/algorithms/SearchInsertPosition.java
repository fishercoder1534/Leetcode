package stevesun.algorithms;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */
public class SearchInsertPosition {

    public int searchInsert(int[] A, int target) {
        int len = A.length;
        if (len == 0)
            return 0;
        else {
            for (int i = 0; i < len; i++) {
                if (A[0] > target)
                    return 0;
                else if (A[len - 1] < target)
                    return len;
                else if (A[i] == target)
                    return i;
                else if (A[i] < target && A[i + 1] > target)
                    return i + 1;
            }
            return len;
        }
    }

}
