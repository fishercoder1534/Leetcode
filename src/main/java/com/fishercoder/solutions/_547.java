package com.fishercoder.solutions;

/**
 *547. Friend Circles
 *
 *There are N students in a class.
 * Some of them are friends, while some are not. Their friendship is transitive in nature.
 * For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C.
 * And we defined a friend circle is a group of students who are direct or indirect friends.

 Given a N*N matrix m representing the friend relationship between students in the class.
 If m[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not.
 And you have to output the total number of friend circles among all the students.

 Example 1:
 Input:
 [[1,1,0],
 [1,1,0],
 [0,0,1]]
 Output: 2
 Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
 The 2nd student himself is in a friend circle. So return 2.

 Example 2:
 Input:
 [[1,1,0],
 [1,1,1],
 [0,1,1]]
 Output: 1
 Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
 so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.

 Note:
 N is in range [1,200].
 m[i][i] = 1 for all students.
 If m[i][j] = 1, then m[j][i] = 1.
 */
public class _547 {

    public static class Solution1 {
        public int findCircleNum(int[][] M) {
            if (M == null || M.length == 0 || M[0].length == 0) {
                return 0;
            }
            int m = M.length;//number of rows in this matrix
            UnionFind unionFind = new UnionFind(m);
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (M[i][j] == 1) {
                        unionFind.union(i, j);
                    }
                }
            }
            return unionFind.count;
        }

        class UnionFind {
            int count;
            int[] root;

            public UnionFind(int m) {
                root = new int[m];
                for (int i = 0; i < m; i++) {
                    root[i] = i;
                }
                count = m;
            }

            public void union(int i, int j) {
                int x = find(root, i);
                int y = find(root, j);
                if (x != y) {
                    count--;
                    root[x] = y;//path compression
                }
            }

            public int find(int[] ids, int i) {
                if (ids[i] == i) {
                    return i;
                }
                return find(ids, ids[i]);
            }
        }
    }

}
