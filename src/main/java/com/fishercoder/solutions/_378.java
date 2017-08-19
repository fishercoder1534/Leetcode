package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**378. Kth Smallest Element in a Sorted Matrix
 *
Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.

 Note:
You may assume k is always valid, 1 ≤ k ≤ n2.*/
public class _378 {
    //brute force made it AC'ed, extreme test case needed for OJ
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
    
    //TODO: use heap and binary search to do it.

    //Binary Search : The idea is to pick a mid number than compare it with the elements in each row, we start form
    // end of row util we find the element is less than the mid, the left side element is all less than mid; keep tracking elements
    // that less than mid and compare with k, then update the k.
    public int kthSmallestBS(int[][] matrix, int k) {
        int row = matrix.length - 1, col = matrix[0].length - 1;
        int lo = matrix[0][0];
        int hi = matrix[row][col] ;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            int count = 0, j = col;
            for(int i= 0; i <= row; i++) {
                while(j >=0 && matrix[i][j] > mid) {
                    j--;
                }
                count += (j + 1);
            }
            if(count < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
