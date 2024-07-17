package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1339 {
    public static class Solution1 {
        public int maxProduct(TreeNode root) {
            Set<Long> set = new HashSet<>();
            long total = postOrder(root, set);
            long result = 0L;
            for (long sum : set) {
                result = Math.max(result, sum * (total - sum));
            }
            return (int) (result % 1000000007);
        }

        private long postOrder(TreeNode root, Set<Long> set) {
            if (root == null) {
                return 0;
            }
            long leftSum = postOrder(root.left, set);
            long rightSum = postOrder(root.right, set);
            long sum = root.val + leftSum + rightSum;
            set.add(sum);
            return sum;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution, but much more verbose and uses more extra space.
         */
        public int maxProduct(TreeNode root) {
            Map<TreeNode, Long> sumMap = new HashMap<>();
            long totalSum = postOrderBuildSumMap(root, sumMap);
            sumMap.put(root, totalSum);
            List<long[]> productList = new ArrayList<>();
            postOrderBuildProductList(root, sumMap, productList, sumMap.get(root));
            long result = 0L;
            double modulo = Math.pow(10, 9) + 7;
            for (long[] p : productList) {
                long product = p[0] * p[1];
                result = Math.max(result, product);
            }
            return (int) (result % modulo);
        }

        private void postOrderBuildProductList(TreeNode root, Map<TreeNode, Long> sumMap, List<long[]> productList, Long total) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                return;
            }
            postOrderBuildProductList(root.left, sumMap, productList, total);
            postOrderBuildProductList(root.right, sumMap, productList, total);
            if (root.left != null) {
                //suppose we cut off left subtree now
                long leftSum = sumMap.get(root.left);
                long remainder = total - leftSum;
                productList.add(new long[]{leftSum, remainder});
            }
            if (root.right != null) {
                //suppose we cut off right subtree now
                long rightSum = sumMap.get(root.right);
                long remainder = total - rightSum;
                productList.add(new long[]{rightSum, remainder});
            }
        }

        private long postOrderBuildSumMap(TreeNode root, Map<TreeNode, Long> sumMap) {
            if (root == null) {
                return 0L;
            }
            long leftSum = postOrderBuildSumMap(root.left, sumMap);
            long rightSum = postOrderBuildSumMap(root.right, sumMap);
            long sum = leftSum + rightSum + root.val;
            sumMap.put(root, sum);
            return sum;
        }

    }
}
