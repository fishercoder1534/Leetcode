package com.fishercoder.solutions;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

 Note:
 You can assume that you can always reach the last index.
 */
public class _45 {

    public int jump(int[] A) {
        int jumps = 0;
        int len = A.length;
        if (len == 0 || len == 1) {
            return jumps;
        } else if (len == 2) {
            return 1;
        } else {
            int val = A[0];
            int index = 0;
            if (val == 0) {
                return jumps;
            }
            while (index < len) {
                int max = A[index];
                if (max + index >= len - 1) {
                    jumps++;
                    return jumps;
                }
                int tempMax = 0;
                int tempMaxIndex = 0;
                tempMax = A[index + 1];
                for (int i = 0; i < val; i++) {
                    // here's another tricky part:
                    // must set i = 0 as starting
                    // point
                    if (i + index >= len - 1) {
                        jumps++;
                        return jumps;
                    }
                    if (i + A[index + i + 1] >= tempMax) {
                        // when set i = 0 as
                        // starting point,
                        // then here must
                        // add 1
                        tempMax = A[index + i + 1] + i;
                        tempMaxIndex = index + i + 1;
                    }
                }
                if (tempMax >= max) {
                    // here must be great than or equal, equal
                    // is very important!
                    max = tempMax;
                    index = tempMaxIndex;
                }
                val = A[index];
                jumps++;
            }
        }
        return jumps;
    }

}
