package com.fishercoder.solutions;

public class _307 {

    public static class Solution1 {
        class NumArray {
            class SegmentTreeNode {
                SegmentTreeNode left;
                SegmentTreeNode right;
                int start;
                int end;
                int sum;

                public SegmentTreeNode(int start, int end) {
                    this.start = start;
                    this.end = end;
                    this.left = null;
                    this.right = null;
                    this.sum = 0;
                }
            }

            private SegmentTreeNode root = null;

            public NumArray(int[] nums) {
                root = buildSegmentTree(nums, 0, nums.length - 1);
            }

            SegmentTreeNode buildSegmentTree(int[] nums, int start, int end) {
                if (start > end) {
                    return null;
                } else {
                    SegmentTreeNode root = new SegmentTreeNode(start, end);
                    if (start == end) {
                        root.sum = nums[start];
                    } else {
                        int mid = start + (end - start) / 2;
                        root.left = buildSegmentTree(nums, start, mid);
                        root.right = buildSegmentTree(nums, mid + 1, end);
                        root.sum = root.left.sum + root.right.sum;
                    }
                    return root;
                }
            }

            void update(int i, int val) {
                update(root, i, val);
            }

            void update(SegmentTreeNode root, int pos, int val) {
                if (root.start == root.end) {
                    root.sum = val;
                } else {
                    int mid = root.start + (root.end - root.start) / 2;
                    if (pos <= mid) {
                        update(root.left, pos, val);
                    } else {
                        update(root.right, pos, val);
                    }
                    root.sum = root.left.sum + root.right.sum;
                }
            }

            public int sumRange(int i, int j) {
                return sumRange(root, i, j);
            }

            int sumRange(SegmentTreeNode root, int start, int end) {
                if (root.end == end && root.start == start) {
                    return root.sum;
                } else {
                    int mid = root.start + (root.end - root.start) / 2;
                    if (end <= mid) {
                        return sumRange(root.left, start, end);
                    } else if (start >= mid + 1) {
                        return sumRange(root.right, start, end);
                    } else {
                        return sumRange(root.right, mid + 1, end) + sumRange(root.left, start, mid);
                    }
                }
            }
        }
    }
}

