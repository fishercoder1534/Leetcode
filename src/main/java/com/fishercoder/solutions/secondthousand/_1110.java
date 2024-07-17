package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class _1110 {
    public static class Solution1 {
        public List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            for (int d : toDelete) {
                delete(d, queue);
            }
            List<TreeNode> result = new ArrayList<>();
            while (!queue.isEmpty()) {
                result.add(queue.poll());
            }
            return result;
        }

        private void delete(int toDelete, Queue<TreeNode> queue) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (delete(curr, toDelete, queue)) {
                    if (toDelete != curr.val) {
                        queue.offer(curr);
                    }
                    break;
                } else {
                    queue.offer(curr);
                }
            }
        }

        private boolean delete(TreeNode curr, int toDelete, Queue<TreeNode> queue) {
            if (curr == null) {
                return false;
            } else {
                if (curr.val == toDelete) {
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                    return true;
                } else if (curr.left != null && curr.left.val == toDelete) {
                    if (curr.left.left != null) {
                        queue.offer(curr.left.left);
                    }
                    if (curr.left.right != null) {
                        queue.offer(curr.left.right);
                    }
                    curr.left = null;
                    return true;
                } else if (curr.right != null && curr.right.val == toDelete) {
                    if (curr.right.left != null) {
                        queue.offer(curr.right.left);
                    }
                    if (curr.right.right != null) {
                        queue.offer(curr.right.right);
                    }
                    curr.right = null;
                    return true;
                }
                return delete(curr.left, toDelete, queue) || delete(curr.right, toDelete, queue);
            }
        }
    }

    public static class Solution2 {
        //use BFS
        public List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
            Set<Integer> deleteSet = new HashSet<>();
            for (int d : toDelete) {
                deleteSet.add(d);
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            List<TreeNode> forest = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode curr = q.poll();

                //process left child if any
                if (curr.left != null) {
                    //add it into the q first because we need to process it any ways as it might have children that might not need to be deleted
                    q.offer(curr.left);
                    if (deleteSet.contains(curr.left.val)) {
                        curr.left = null;
                    }
                }

                //process right child if any
                if (curr.right != null) {
                    q.offer(curr.right);
                    if (deleteSet.contains(curr.right.val)) {
                        curr.right = null;
                    }
                }

                //process this curr node: if it needs to be deleted, then add its non-null children into forest as we checked its children
                // and we know they do not need to be deleted at this point
                if (deleteSet.contains(curr.val)) {
                    if (curr.left != null) {
                        forest.add(curr.left);
                    }
                    if (curr.right != null) {
                        forest.add(curr.right);
                    }
                }
                //we don't add curr into forest here, otherwise there might be duplicate as we might have added them as their parent's child already
            }
            //at this point, only root might be missing, so we check root
            if (!deleteSet.contains(root.val)) {
                forest.add(root);
            }
            return forest;
        }
    }
}
