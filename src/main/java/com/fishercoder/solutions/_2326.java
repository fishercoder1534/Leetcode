package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _2326 {
    public static class Solution1 {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int[][] matrix = new int[m][n];
            int i = 0;
            int j = 0;
            int index = 0;
            int rightBorder = n - 1;
            int bottom = m - 1;
            int leftBorder = 0;
            int top = 1;
            int count = 0;
            while (index < m * n) {
                //go right
                while (j <= rightBorder) {
                    matrix[i][j++] = index < list.size() ? list.get(index++) : -1;
                    count++;
                }
                if (count >= m * n) {
                    return matrix;
                }
                rightBorder--;
                j--;

                //go down
                i++;
                while (i <= bottom) {
                    matrix[i++][j] = index < list.size() ? list.get(index++) : -1;
                    count++;
                }
                if (count >= m * n) {
                    return matrix;
                }
                i--;
                bottom--;

                //go left
                j--;
                while (j >= leftBorder) {
                    matrix[i][j--] = index < list.size() ? list.get(index++) : -1;
                    count++;
                }
                if (count >= m * n) {
                    return matrix;
                }
                j++;
                leftBorder++;

                //go top
                i--;
                while (i >= top) {
                    matrix[i--][j] = index < list.size() ? list.get(index++) : -1;
                    count++;
                }
                if (count >= m * n) {
                    return matrix;
                }
                i++;
                top++;
                j++;
            }
            return matrix;
        }
    }
}
